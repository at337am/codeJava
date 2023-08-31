package com.linyz.a04Generic.GenericClass;

import java.util.Arrays;

// 泛型类
public class MyArrayList<E> {

    public MyArrayList(){

    }

    Object[] obj = new Object[10];
    int size;

    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }

}
