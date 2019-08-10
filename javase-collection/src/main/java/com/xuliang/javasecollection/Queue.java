package com.xuliang.javasecollection;

/**
 * @author xulia
 * @create 2019-08-09 22:13
 */
public interface Queue<E> {
    void add(E element);

    E remove();

    int size();

}