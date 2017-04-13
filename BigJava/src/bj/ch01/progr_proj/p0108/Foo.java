package bj.ch01.progr_proj.p0108;

import java.util.Arrays;

public class Foo {
    public static void main(String[] args) {
        final long delay = 1000;
        long mem1;
        long mem2;

        System.out.println("Free memory: " + (mem1 = Runtime.getRuntime().freeMemory()));
        Foo f = new Foo();
//        pause(delay);
        System.out.println("Free memory: " + (mem2 = Runtime.getRuntime().freeMemory()));
        displayMemoryChange(mem1, mem2);

        f = null;
        pause(delay);

        System.gc();
        pause(delay);
        mem1 = mem2;
        System.out.println("Free memory: " + (mem2 = Runtime.getRuntime().freeMemory()));
        displayMemoryChange(mem1, mem2);

        f = new Foo();
//        pause(delay);
        mem1 = mem2;
        System.out.println("Free memory: " + (mem2 = Runtime.getRuntime().freeMemory()));
        displayMemoryChange(mem1, mem2);

        f = null;
        pause(delay);

        System.gc();
        pause(delay);
        mem1 = mem2;
        System.out.println("Free memory: " + (mem2 = Runtime.getRuntime().freeMemory()));
        displayMemoryChange(mem1, mem2);
    }

    private static void displayMemoryChange(long mem1, long mem2) {
        long delta = mem2 - mem1;
        long kb = delta / 1024;
        long mb = kb / 1024;
        System.out.printf("Memory change: %d mb, %d kb, %d bytes%n", mb, kb, delta);
    }

    private static void pause(long ms) {
        System.out.println("pause for " + ms + " ms");
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private final static int SIZE = 100 * 1024 * 1024 / 8;
    private static int lastId;
    private int id;
    private long[] data;

    private Foo() {
        id = ++lastId;
        data = new long[SIZE];
        Arrays.fill(data, Long.MAX_VALUE);
        System.out.println("Constructor #" + id);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        data = null;
        System.out.println("finalize() #" + id);
    }
}

