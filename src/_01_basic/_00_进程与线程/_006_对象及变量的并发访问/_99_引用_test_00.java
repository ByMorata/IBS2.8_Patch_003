package _01_basic._00_进程与线程._006_对象及变量的并发访问;

public class _99_引用_test_00 {

    synchronized public void run() {

        System.out.println(Thread.currentThread().getName() + " : ");
        try {
            Thread.sleep(1);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end ...");
    }
}
