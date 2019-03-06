package com.lin.designPatterns;

import com.lin.designPatterns.singletonMode.SingletonEnum;
import com.lin.designPatterns.singletonMode.SingletonModeHungry;

import java.util.ArrayList;
import java.util.List;

/**
 * 类 <code>{类名称}</code>{多线程测试类}
 *
 * @author zangbao.lin
 * @version 2019/3/6
 * @since JDK 1.8
 */

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println(SingletonEnum.INSTANCE.getInstance().hashCode());
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();

        List<Thread> threadList = new ArrayList<>();
        for(int i=0;i<100;i++) {
            Thread t = new Thread(tt);
            threadList.add(t);
        }

        for(Thread t:threadList) {
            t.start();
        }

    }
}
