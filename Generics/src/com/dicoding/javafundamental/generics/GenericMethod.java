package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethod {
//    static void arrayToCollection(Object[] a, Collection<?> c){
//        for (Object o : a){
//            c.add(o); // baris ini tidak valid
//        }
//    }

    static <T> void arrayToCollection(T[] a, Collection<T> c){
        for (T o : a){
            c.add(o); // baris ini valid
        }
    }

    public static void main(String[] args){
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();

        // T inferred to be String
        arrayToCollection(sa, cs);

        // T inferred to be Object
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();

        // T inferred to be Number
        arrayToCollection(ia, cn);

        // T inferred to be Number
        arrayToCollection(fa, cn);

        // T inferred to be Number
        arrayToCollection(na, cn);

        // T inferred to be Object
        arrayToCollection(na, co);

        // compile-error
        arrayToCollection(na,cs);

    }
}
