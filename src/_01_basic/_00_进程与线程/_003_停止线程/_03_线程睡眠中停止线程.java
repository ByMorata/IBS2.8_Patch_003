package _01_basic._00_进程与线程._003_停止线程;


public class _03_线程睡眠中停止线程 extends Thread {

    _03_线程睡眠中停止线程(final String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {

        System.out.println("this beging ...");
        try {

            Thread.sleep(1000);
            System.out.println("this end ...");
        } catch (
                InterruptedException e) {
            System.out.println(" 先停止，再遇到了sleep! 进入catch!");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {

        _03_线程睡眠中停止线程 class_00 = new _03_线程睡眠中停止线程("class_00");
        class_00.start();
        class_00.sleep(100);
        class_00.interrupt();
        System.out.println("ends...");
    }


}
