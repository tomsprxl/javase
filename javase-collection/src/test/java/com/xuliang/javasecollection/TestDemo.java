package com.xuliang.javasecollection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author xulia
 * @create 2019-08-10 15:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {


    @Test
    public void  test1(){
        Employee[] employees = {new Employee(55), new Employee(66),new Employee(33)};
        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println("employee = " + employee);
        }

    }

    @Test
    public void  test2(){
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"1","2","3");
        arrayList.removeIf(t->t.equals("2"));
        System.out.println("arrayList.toString() = " + arrayList.toString());
    }

}