package io.github.ylingxiao.daily.june;

import java.io.File;
import java.util.ResourceBundle;

/**
 * 获取对应目录下所有文件，并筛选出特定文件
 * @Author ylingxiao
 */
public class J1601 {
    private static ResourceBundle rb = ResourceBundle.getBundle("count") ;
    public static void main(String [] args){
        File f = new File(rb.getString("countDirectory"));
        getFiles(f);
    }

    /**
     * 得到所有文件递归
     * @param f 目录或文件
     */
    static void getFiles(File f){
        if(f.isDirectory()){
            for (File item : f.listFiles()) {
                getFiles(item);
            }
            return;
        }
        String patten = ".java";
        if(f.getName().endsWith(patten)){
            System.out.println(f.getName());
        }
    }
}
