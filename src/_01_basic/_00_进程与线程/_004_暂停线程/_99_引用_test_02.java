package _01_basic._00_进程与线程._004_暂停线程;

public class _99_引用_test_02 extends Thread {
    @Override
    public void run() {

        int i = 0;
        while (true) {
            i++;
        }
    }
}
