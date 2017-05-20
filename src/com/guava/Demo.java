package com.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.BiMap;
import com.google.common.collect.Collections2;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

public class Demo {

	 /**
     * 函数式编程:过滤器,对当前集合进行回文判断，并返回过滤后的集合
     */
    @Test
    public void testFilter(){
        //创建List 静态初始化
        List<String> list = Lists.newArrayList("moon","son","dad","refer");
        //找出回文 palindronme backwoeds mirror words
        Collection<String> palindromeList = Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                //业务逻辑
                return new StringBuilder(input).reverse().toString().equals(input);
            }
        });
        for(String temp : palindromeList){
            System.out.println(temp);
            //输出结果：dad refer
        }
    }
    
    /**
     *  函数式编程:转换，对集合中的数据进行处理，不改变集合长度
     */
    @Test
    public void testTransform(){
        Set<Long> timeSet = Sets.newHashSet();
        //类型转换
        timeSet.add(19990701L);
        timeSet.add(20080808L);
        timeSet.add(20161212L);
        Collection<String> timeStrCol = Collections2.transform(timeSet, new Function<Long,String>(){
            @Override
            public String apply(Long input) {
                return new SimpleDateFormat("yyyy-MM-dd").format(input);
            }
        });
        for(String temp : timeStrCol){
            System.out.println(temp);
        }
    }
    
    /**
     * 组合式函数编程 相当于上面的new Function提了出来
     *     确保容器中的字符串长度不超过5，超过进行截取，然后全部大写
     */
    @Test
    public void testGuava4(){
        List<String> list = Lists.newArrayList("abcde","good","happiness");
        //确保容器中的字符串长度不超过5
        Function<String, String> f1 = new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.length()>5?input.substring(0, 5):input;
            }
        };
        //转成大写
        Function<String, String> f2 = new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };
        //String = f2(f1(String))
        Function<String, String> f = Functions.compose(f1, f2);
        Collection<String> resultCol = Collections2.transform(list, f);
        for(String str:resultCol){
            System.out.println(str);
            /*
             * 输出结果：
                       ABCDE
                       GOOD
                       HAPPI
               */
        }
    }
    
    /**
     * 统计单词出现的次数
     * 1、HashMap 分拣存储+面向对象思维   --->判断
     * 2、Multiset:无序可重复  .count()  增强可读性+操作简单
     */
    @Test
    public void testGuava7(){
        String str = "this is a cat and that is mice where is the food";
        //分割字符串
        String[] arr = str.split(" ");
        //存储到Multiset中
        Multiset<String> set = HashMultiset.create();
        for(String ss:arr){
            set.add(ss);
        }
        //获取所有的单词set
        Set<String> letters = set.elementSet();
        for(String temp:letters){
            System.out.println(temp+":"+set.count(temp));
        }
    }
    
    @Test
    public void testGuava8(){
        Map<String, String> map = new HashMap<String, String>();
        //加入测试数据
        map.put("改革开放", "邓爷爷");
        map.put("三个代表", "江主席");
        map.put("科学发展观", "胡主席");
        map.put("和谐社会", "胡主席");
        map.put("八荣八耻", "胡主席");
        //Multimap
        Multimap<String, String> teacher = ArrayListMultimap.create();
        //迭代器
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey(); //课程
            String value = entry.getValue(); //教师
            //教师--->课程
            teacher.put(value, key);
        }
        //查看Multimap
        Set<String> keySet = teacher.keySet();
        for(String key:keySet){
            Collection<String> col = teacher.get(key);
            System.out.println(key+":"+col);
        }
    }
    
    /**
     * HashMap 键唯一,值可以重复
     * BiMap:双向Map(bidirectional Map) 键与值不能重复(unique -valued map)
     */
    @Test
    public void testGuava9(){
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("sina", "@sina.com");
        biMap.put("qq", "@qq.com");
        //通过邮箱找用户
        System.out.println(biMap.inverse());
        String user = biMap.inverse().get("@sina.com");
        System.out.println(user);
        System.out.println(biMap.inverse().inverse()==biMap);
    }
    
    /**
     * 双键的Map -->Table --->rowKey+columnKye+value
     */
    @Test
    public void testGuava10(){
        Table<String, String, Integer> table = HashBasedTable.create();
        //测试数据
        table.put("龙傲天", "java", 50);
        table.put("龙傲天", "oracle", 60);
        table.put("福尔康", "java", 70);
        table.put("福尔康", "oracle", 100);
        //所有的行数据
        Set<Cell<String, String, Integer>> cells = table.cellSet();
        for(Cell<String, String, Integer> temp : cells){
        		System.out.println(temp.getRowKey()+":"+temp.getColumnKey()+":"+temp.getValue());
        }
        /*
        龙傲天:java:50
        龙傲天:oracle:60
        福尔康:java:70
        福尔康:oracle:100*/
        System.out.println("=======学生查看成绩========");
        System.out.print("学生\t");
        //所有的课程
        Set<String> cours = table.columnKeySet();
        for(String t : cours){
            System.out.print(t+"\t");
        }
        System.out.println();
        //所有的学生
        Set<String> stus = table.rowKeySet();
        for(String stu:stus){
            System.out.print(stu+"\t");
            Map<String,Integer> scores  = table.row(stu);
            for(String c:cours){
                System.out.print(scores.get(c)+"\t");
            }
            System.out.println();
        }
    }
        /*
        学生       java     oracle    
        龙傲天    50     60    
        福尔康    70     100*/
    
}	
