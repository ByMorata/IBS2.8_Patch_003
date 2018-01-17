package _01_basic._00_进程与线程._004_暂停线程;

public class _99_引用_test_01 {

    synchronized public void printString()
    {
        System.out.println("begin ...");
        if (Thread.currentThread().getName().equals("a"))
        {
            System.out.println("a线程全部锁死了");
            Thread.currentThread().suspend();
        }
        System.out.println("end  ....");
    }
}
