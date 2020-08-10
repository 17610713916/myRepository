package com.mozat.test;

import java.util.*;

public class random_test1 {

    public static void main(String[] args) {
        //设置分组数k
        int k = 3;
//将人员数组转为集合
        String[] names = {"a1", "a2", "a3", "a4", "a5", "a6","a7"};
        List<String> list= Arrays.asList(names);
        List<String> arrList = new ArrayList<String>(list);
//存储组内人员map，key组号，value人员
        HashMap<Integer, HashSet<String>> map = new HashMap<Integer, HashSet<String>>();
//设置计算countset
        HashSet<String> countset = new HashSet<>();
//设置组号
        int zu = 0;
        while (true) {
            //设置随机数
            int i = new Random().nextInt(arrList.size());
            //随机获取一个人员
            String name = arrList.get(i);
            //获取完将其从集合中删除
            arrList.remove(i);
            //添加map
            HashSet<String> set = map.getOrDefault(zu, new HashSet<String>());
            set.add(name);
            map.put(zu, set);
            //当组内人员满了，分配到下一个组中
            if (set.size() == k){
                zu +=1;
            }
            //计数
            countset.add(name);
            //当全部人员分配完毕，退出循环
            if (countset.size() == names.length){
                break;
            }

        }

        for (Map.Entry<Integer ,HashSet<String>> entry : map.entrySet()){
            System.out.println(entry.getKey() + "---"+entry.getValue());
        }
    }
}
