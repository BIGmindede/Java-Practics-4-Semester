package lab_03;

import java.util.HashMap;

public class Tester {

    public static void setTest() throws InterruptedException {
        SemaSet semaSet = new SemaSet();

        Thread one = new Thread(() -> {
            for (Integer i = 0; i < 10; i++) {
                semaSet.add(i, "T1");
//                System.out.println("T1 " + i);
            }
        });

        Thread two = new Thread(() -> {
            for (Integer i = 0; i < 10; i++) {
                semaSet.add(i, "T2");
//                System.out.println("T2 " + i);
            }
        });

        Thread three = new Thread(() -> {
            for (Integer i = 0; i < 10; i++) {
                semaSet.add(i, "T3");
//                System.out.println("T3 " + i);
            }
        });
        one.start();
        two.start();
        three.start();

        Thread.sleep(1000);
    }

    public static void mapTest() throws InterruptedException {

        SynchMap map = new SynchMap();
        Thread one = new Thread(() -> {
            for (Integer i = 0; i < 10; i++) {
                map.put(i, i.toString());
                System.out.println("T1 " + i);
            }
        });

        Thread two = new Thread(() -> {
            for (Integer i = 0; i < 10; i++) {
                map.put(i, i.toString());
                System.out.println("T2 " + i);
            }
        });

        one.start();
        two.start();

        Thread.sleep(1000);
    }
    public static void main(String[] args) throws InterruptedException {
        // mapTest(); //Если убрать Synchronized в классе мапы, то потоки начнут выполняться в хаотичном порядке
        setTest();
    }
}
