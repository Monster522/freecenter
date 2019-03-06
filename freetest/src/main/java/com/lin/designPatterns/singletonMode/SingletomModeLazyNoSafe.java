package com.lin.designPatterns.singletonMode;

/**
 * 类 <code>{类名称}</code>{单例模式-懒汉单例-线程非安全}
 *
 * @author zangbao.lin
 * @version 2019/3/6
 * @since JDK 1.8
 */

public class SingletomModeLazyNoSafe {
    //1.声明单例类
    private static SingletomModeLazyNoSafe instance;

    //2.私有构造方法
    private SingletomModeLazyNoSafe(){}

    //3.获取单例
    public static SingletomModeLazyNoSafe getInstance() {
        if(instance == null) {
            instance = new SingletomModeLazyNoSafe();
        }
        return instance;
    }
}
