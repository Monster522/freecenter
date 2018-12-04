package com.lin.fileupload.mainFile;

import java.io.*;

/**
 * Created by baozang Cotter on 2018/11/30.
 */
public class StreamUsing {
    public static String srcPath = "D://testImg/";

    public static String drtPath = "D://testGif/";

    public static void main(String[] args){
        StreamUsing su = new StreamUsing();
        su.copyFile("lisana.txt");
    }

    //FileInputStream读取文件内容
    public void getContext(String fileName) {
        FileInputStream fis = null;
        String result = "";

        try {
            //实例化输入流对象
            fis = new FileInputStream(srcPath+fileName);
            //创建接收byte数组
            int size = fis.available();
            byte[] byteArr = new byte[size];
            //读取内容到数组并转换为字符串
            fis.read(byteArr);
            result = new String(byteArr);
            //打印文件内容
            System.out.println(result);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            //关闭输入流
            if(fis != null){
                try {
                    fis.close();
                }catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    //FileOutputStream写入文件内容
    public void pushContext(String fileName) {
        FileOutputStream fos = null;
        String content = "\nJava 8 as a baseline";

        try {
            //实例化输出对象:新建输出对象如果没有append值就会清空原有内容
            fos = new FileOutputStream(srcPath+fileName,true);
            //准备输出内容字节数组
            byte[] byteArr = content.getBytes();
            //写入内容
            fos.write(byteArr);
            //读取文件内容
            getContext(fileName);
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }

    }

    //复制文件
    public void copyFile(String fileName) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //实例化输入对象
            fis = new FileInputStream(srcPath+fileName);
            //读取文件内容
            byte[] byteArr = new byte[fis.available()];
            fis.read(byteArr);
            //往新文件写入内容：当文件不存在时，新建fos会自动创建一个新文件，fis则会报错
            fos = new FileOutputStream(drtPath+fileName);
            fos.write(byteArr);
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                if(fis != null) fis.close();
                if(fos != null) fos.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
