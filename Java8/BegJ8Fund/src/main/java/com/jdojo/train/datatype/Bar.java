package com.jdojo.train.datatype;

public class Bar {
    public static void main(String[] args) throws InterruptedException {
        final int size = 1500;
        Bar[] refs = new Bar[size];

        long mem0 = Runtime.getRuntime().freeMemory();
        System.out.println("Initial: " + mem0);
        for (int i = 0; i < size; i++) {
            refs[i] = new Bar();
        }

        long mem1 = Runtime.getRuntime().freeMemory();
        System.out.println("For size = " + size);
        System.out.println("mem0 = " + mem0);
        System.out.println("mem1 = " + mem1);
        long diff = mem0 - mem1;
        System.out.println("diff = " + diff);
        System.out.println("aver = " + ((double)diff / size));

        refs = null;
        System.gc();
        Thread.sleep(1000L);
        mem0 = mem1;
        mem1 = Runtime.getRuntime().freeMemory();
        System.out.println("mem0 = " + mem0);
        System.out.println("mem1 = " + mem1);
        diff = mem0 - mem1;
        System.out.println("diff = " + diff);
        System.out.println("aver = " + ((double)diff / size));
    }
}
