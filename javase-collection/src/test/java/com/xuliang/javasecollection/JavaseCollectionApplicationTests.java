package com.xuliang.javasecollection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.lang.model.SourceVersion;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaseCollectionApplicationTests {

    @Test
    public void contextLoads() {

    }


    @Test
    public void test() {
        Collection c = new ArrayList();

        c.add("1");
        c.add("2");
        c.add("3");

        Iterator it = c.iterator();

        c.forEach(System.out::println);

    }


    @Test
    public void test1() {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "1", "2", "3", "5");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "1", "2", "3");
        list1.retainAll(list2);
        for (String s : list1) {
            System.out.println("s = " + s);
        }
    }

    @Test
    public void test2() {
        HashMap<String, String> map = new HashMap<>();
        String s = map.put("1", "one");
        String s1 = map.put("2", "two");
        map.forEach((k,v)-> System.out.println("k = " + k+"v = "+ v));


    }

}
