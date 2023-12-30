package pro.sky.javacoursepart2;

import pro.sky.javacoursepart2.intList.IntList;
import pro.sky.javacoursepart2.intList.IntListImpl;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntList list = new IntListImpl();
        list.add(10);
        System.out.println(Arrays.toString(list.toArray()));
    }





}