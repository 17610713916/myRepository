package com.mozat.jsonTojava;

import com.google.gson.Gson;

import java.util.List;

public class FileUtilsTest {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Administrator\\Desktop\\data-test\\json数据.txt";
        List<String> jsonContent = FileUtils.ReadFile(filePath);
        for (int i=0;i<=jsonContent.size()-1;i++){
            String a=jsonContent.get(i);
            Student aa=new Gson().fromJson(a,Student.class);
            String b=aa.getUserid().toString();
            System.out.println(aa);
            System.out.println(b);
        }

    }
}
