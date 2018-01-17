package _01_basic._00_进程与线程._004_暂停线程;

public class _02_暂停线程导致独占锁死_1 extends Thread {

    @Override
    public void run() {
        int i = 0;

        while (true) {
            i++;
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        _02_暂停线程导致独占锁死_1 class_00 = new _02_暂停线程导致独占锁死_1();
        class_00.start();
        Thread.sleep(1000);
        class_00.suspend();
        System.out.println("main end ... ");
        class_00.stop();
    }
}
