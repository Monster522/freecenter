package com.lin.algorithm.reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by baozang Cotter on 2018/12/4.
 */
public class ThreeReflect {

    public static void main(String[] args) throws Exception{
        //获取反射对象
        Mobile mobile = new Mobile();
        //1.通过实例化对象获取-必须实例化
        Class m1 = mobile.getClass();
        //2.通过类名获取-必须保证该类存在
        Class m2 = Mobile.class;
        //3.通过字符串类名获取-可以将字符串类名写在配置文件
        Class m3 = Class.forName("com.lin.algorithm.reflect.Mobile");

        //获取构造方法
        //1.批量获取构造方法
        Constructor[] crs1 = m3.getConstructors();//公有构造方法
        Constructor[] crs2 = m3.getDeclaredConstructors();//所有构造方法
        //2.获取单个构造方法
        Constructor cr1 = m3.getConstructor();
        Constructor cr2 = m3.getConstructor(String.class,String.class,String.class);
        //3.构造方法创建实例对象
        Mobile me1 = (Mobile) cr1.newInstance();
        Mobile me2 = (Mobile) cr2.newInstance("MIX3","XIAOMI","BLACK");

        //获取成员变量
        //1.批量获取成员变量
        Field[] fds1 = m3.getFields();//公有成员变量
        Field[] fds2 = m3.getDeclaredFields();//所有成员变量
        //2.获取单个成员变量
        Field fd1 = m3.getDeclaredField("name");
        Field fd2 = m3.getDeclaredField("brand");
        Field fd3 = m3.getDeclaredField("corlor");
        //3.获取、设置成员变量值
        fd1.setAccessible(true);//设置可以访问私有变量
        fd1.set(me2,"HUAWEI");//获取
        String fstr = fd1.get(me2).toString();//设置

        //获取成员方法
        //1.批量获取成员方法
        Method[] mds1 = m3.getMethods();//公有成员方法
        Method[] mds2 = m3.getDeclaredMethods();//所有成员方法
        //2.获取单个成员方法
        Method md1 = m3.getMethod("getFullName", String.class);
        Method md2 = m3.getMethod("toString");
        //3.调用成员方法
        md1.setAccessible(true);//允许调用私有方法
        String mstr1 = md1.invoke(me2,"XIAOMI").toString();
        String mstr2 =  md2.invoke(me2).toString();

        //加载配置文件
        Properties pro = new Properties();
        FileReader fr = new FileReader("D:\\Development\\gitproject\\freecenter\\freetest\\src\\main\\resources\\reflect.txt");
        pro.load(fr);
        fr.close();

        System.out.println(pro.getProperty("username"));

    }

}
