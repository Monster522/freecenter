package com.lin.designPatterns.singletonMode;

/**
 * 类 <code>{类名称}</code>{单例模式-懒汉-线程安全}
 *
 * @author zangbao.lin
 * @version 2019/3/6
 * @since JDK 1.8
 */

public class SingletomModeLazySafe {
    //1.使用volatile关键字保证内存可见性
    volatile private static SingletomModeLazySafe instance;

    //2.私有构造方法
    private void SingletomModeLazySafe(){};

    //3.获取单例
    public SingletomModeLazySafe getInstance(){
        if(instance != null){
            //其他操作
        }else {
            synchronized(SingletomModeLazySafe.class){
                //同步的检查
                if(instance == null){
                    instance = new SingletomModeLazySafe();
                }
            }
        }
        return instance;
    }
}
