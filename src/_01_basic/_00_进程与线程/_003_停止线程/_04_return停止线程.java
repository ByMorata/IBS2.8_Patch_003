package _01_basic._00_进程与线程._003_停止线程;

public class _04_return停止线程 extends Thread {

    _04_return停止线程(final String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("子线程已经停止退出");
                return;
            }
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        _04_return停止线程 class_00 = new _04_return停止线程("class_00");
        class_00.start();
        class_00.sleep(100);
        class_00.interrupt();
        System.out.println("ends...");
    }
}
