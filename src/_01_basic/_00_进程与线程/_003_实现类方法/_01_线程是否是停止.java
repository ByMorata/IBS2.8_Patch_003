package _01_basic._00_进程与线程._003_实现类方法;

public class _01_线程是否是停止 extends Thread{

    @Override
    public void run() {
        super.run();

        int count_00 = 1000000;

        while(count_00-- > 0)
        {
        }

    }

    public static void main(String[] args) throws Exception{

        _01_线程是否是停止 class_00 = new _01_线程是否是停止();
        class_00.start();
        class_00.interrupt();
        System.out.println("线程是否停止 : " + class_00.isInterrupted());

        Thread.sleep(20000);

        Thread.currentThread().interrupt();
        System.out.println("线程是否停止 : " + Thread.interrupted());

        //Thread.interrupted()方法会清楚状态标志
        System.out.println("线程是否停止 : " + Thread.interrupted());
    }
}
