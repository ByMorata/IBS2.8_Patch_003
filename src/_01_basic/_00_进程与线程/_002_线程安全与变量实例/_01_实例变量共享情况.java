package _01_basic._00_进程与线程._002_线程安全与变量实例;

public class _01_实例变量共享情况 extends Thread {

    private int count_00 = 5;

    public _01_实例变量共享情况(String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    // synchronized 用于解决非线程的安全问题
    synchronized public void run() {
        super.run();
        count_00--;
        System.out.println(Thread.currentThread().getName() + " : " + count_00);

    }

    public static void main(String[] args) {

        _01_实例变量共享情况 class_00 = new _01_实例变量共享情况("class_00");
        Thread class_01 = new Thread(class_00, "class_01");
        Thread class_02 = new Thread(class_00, "class_02");
        Thread class_03 = new Thread(class_00, "class_03");
        Thread class_04 = new Thread(class_00, "class_04");

        class_00.start();
        class_01.start();
        class_02.start();
        class_03.start();
        class_04.start();

        class_00.stop();
        class_01.interrupt();


    }
}
