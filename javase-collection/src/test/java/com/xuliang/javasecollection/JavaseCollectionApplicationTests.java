package com.xuliang.javasecollection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaseCollectionApplicationTests {

    @Test
    public void contextLoads() {

    }


    @Test
    public void  test(){
        Collection c = new ArrayList();

        c.add("1");
        c.add("2");
        c.add("3");

        Iterator it = c.iterator();

        c.forEach(System.out::println);

    }

}
