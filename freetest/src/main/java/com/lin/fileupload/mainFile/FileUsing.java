package com.lin.fileupload.mainFile;

import java.io.*;

/**
 * Created by baozang Cotter on 2018/11/29.
 */
public class FileUsing {
    //文件路径
    public static String filePath = "D://testImg/";

    public static void main(String[] args) throws Exception{
        FileUsing fs = new FileUsing();
        fs.randw("roleye.txt");
    }

    //使用Reader读写文件
    public void randw(String fileName) {
        //建立文件对象
        File file = new File(filePath,fileName);
        String[] content = {"长亭外","古道边","芳草碧连天"};
        try {
            //建立输出节点流
            FileWriter fw = new FileWriter(file);
            //建立输出处理流
            BufferedWriter bw = new BufferedWriter(fw);
            //写入文件
            for(String str: content){
                bw.write(str);
                bw.newLine();
            }
            //关闭后缓冲区会将内容写进文件
            bw.close();
            fw.close();
            //建立输入节点流
            FileReader fr = new FileReader(file);
            //建立输入处理流
            BufferedReader br = new BufferedReader(fr);
            //读取文件内容:每次readline都要接收，预防丢失
            String result;
            while ((result = br.readLine()) != null){
                System.out.println(result);
            }
            //关闭后缓冲区会清空
            br.close();
            fr.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }



}
