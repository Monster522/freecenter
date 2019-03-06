package com.lin.designPatterns.singletonMode;

/**
 * 类 <code>{类名称}</code>{单例模式-饿汉-线程安全}
 * 单例模式：在任何情况下，保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 *
 * @author zangbao.lin
 * @version 2019/3/6
 * @since JDK 1.8
 */

public class SingletonModeHungry {
    //!.实例化一个私有静态对象
    private static SingletonModeHungry instance
            = new SingletonModeHungry();

    //2.私有构造方法
    private SingletonModeHungry(){}

    //3.静态方法，用来获取实例对象
    public static SingletonModeHungry getInstance() {
        return instance;
    }
}
