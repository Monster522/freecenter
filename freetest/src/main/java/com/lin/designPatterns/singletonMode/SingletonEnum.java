package com.lin.designPatterns.singletonMode;

/**
 * 类 <code>{类名称}</code>{此类功能描述}
 *
 * @author zangbao.lin
 * @version 2019/3/6
 * @since JDK 1.8
 */

public enum SingletonEnum {
    //类SingletonEnum的构造方法是私有的
    //INSTANCE相当于是SingletonEnum的子类
    //相当于 public statice final SingletonEnum INSTANCE;
    INSTANCE;

    private Book instance;

    //枚举类型中构造方法默认使用private，保证实例的唯一性
    SingletonEnum(){
        instance = new Book();
    }

    public Book getInstance(){
        return instance;
    }
}


