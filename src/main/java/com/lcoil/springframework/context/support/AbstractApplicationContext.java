package com.lcoil.springframework.context.support;

import com.lcoil.springframework.beans.BeansException;
import com.lcoil.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.lcoil.springframework.beans.factory.config.BeanFactoryPostProcessor;
import com.lcoil.springframework.beans.factory.config.BeanPostProcessor;
import com.lcoil.springframework.context.ApplicationEvent;
import com.lcoil.springframework.context.ApplicationListener;
import com.lcoil.springframework.context.ConfigurableApplicationContext;
import com.lcoil.springframework.context.event.ApplicationEventMulticaster;
import com.lcoil.springframework.context.event.ContextClosedEvent;
import com.lcoil.springframework.context.event.ContextRefreshedEvent;
import com.lcoil.springframework.context.event.SimpleApplicationEventMulticaster;
import com.lcoil.springframework.core.io.DefaultResourceLoader;

import java.util.Collection;
import java.util.Map;

/**
 * @Classname AbstractApplicationContext
 * @Description 抽闲应用上下文
 * @Date 2022/1/9 11:37 PM
 * @Created by l-coil
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    public static final String APPLICATION_EVENT_MULTICASTER_BEAN_NAME = "applicationEventMulticaster";

    private ApplicationEventMulticaster applicationEventMulticaster;


    @Override
    public void refresh() throws BeansException {
        //1. 创建 BeanFactory、并加载 BeanDefinition
        refreshBeanFactory();
        //2. 获取 BeanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        //3. 添加 ApplicationContentAwareProcessor ,让继承自 ApplicationContextAware 的 Bean 对象都能感知所属的 ApplicationContext
        beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
        //4. 在 Bean 实例化之前，执行BeanFactoryPostProcessor （Invoke factory processors registered as beans in the context.）
        invokeBeanFactoryPostProcessors(beanFactory);
        //5. BeanPostProcessor 需要提前于其他 Bean 对象实例化之前执行注册操作
        registerBeanPostProcessors(beanFactory);
        //6. 初始化事件发布者
        initApplicationEventMulticaster();
        //7. 注册事件监听器
        registerListeners();
        //9. 发布容器刷新完成事件
        finishRefresh();

    }

    private void initApplicationEventMulticaster() {
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();
        applicationEventMulticaster = new SimpleApplicationEventMulticaster(beanFactory);

    }

    private void registerListeners() {
        Collection<ApplicationListener> applicationListeners = getBeansOfType(ApplicationListener.class).values();
        for (ApplicationListener listener : applicationListeners) {
            applicationEventMulticaster.addApplicationListener(listener);
        }
    }
    private void finishRefresh(){
        publishEvent(new ContextRefreshedEvent(this));
    }

    @Override
    public void publishEvent(ApplicationEvent event){
        applicationEventMulticaster.multicastEvent(event);
    }

    @Override
    public void close() {
        // 发布容器关闭事件
        publishEvent(new ContextClosedEvent(this));
        // 执行销毁单例bean 的销毁方法
        getBeanFactory().destroySingletons();
    }

    protected abstract void refreshBeanFactory() throws BeansException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()) {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    protected void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()) {
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name) throws BeansException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return getBeanFactory().getBean(name, requiredType);
    }

    @Override
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

}
