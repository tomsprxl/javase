package com.xuliang.javasecollection;

import lombok.Data;

/**
 * @author xulia
 * @create 2019-08-10 15:59
 */
@Data
public class Employee implements Comparable<Employee> {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}