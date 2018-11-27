package com.lin.test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Enzo Cotter on 2018/10/30.
 */
public class AsciiPic {


    /**
     * @param path
     *            图片路径
     */
    public static void createAsciiPic(final String path) {
        long slm = 100;
        final String base = "@#&$%*o!;.";// 字符串由复杂到简单
        try {
            final BufferedImage image = ImageIO.read(new File(path));
            for (int y = 0; y < image.getHeight(); y += 2) {
                for (int x = 0; x < image.getWidth(); x++) {
                    final int pixel = image.getRGB(x, y);
                    final int r = (pixel & 0xff0000) >> 16, g = (pixel & 0xff00) >> 8, b = pixel & 0xff;
                    final float gray = 0.299f * r + 0.578f * g + 0.114f * b;
                    final int index = Math.round(gray * (base.length() + 1) / 255);
                    System.out.print(index >= base.length() ? " " : String.valueOf(base.charAt(index)));
                }
                Thread.sleep(slm);
                System.out.println();
            }
        } catch (final IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(final String[] args) {
        String str = "mainBrand,mainShangshishijian,mainDizuopeizhi,,,,,,STRUCTURE_WITHOUTBASE_WEIGHT,STRUCTURE_WITHBASE_WEIGHT,,,,";
        String[] s = str.split(",");
        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }
    }

}
