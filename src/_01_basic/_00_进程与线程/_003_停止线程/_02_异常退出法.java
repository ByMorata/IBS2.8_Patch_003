package _01_basic._00_进程与线程._003_停止线程;

public class _02_异常退出法 extends Thread {

    _02_异常退出法(final String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {

        while (true) {
            if (this.isInterrupted()) {
                System.out.println("子线程已经停止退出");
                break;
            }
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) throws InterruptedException{

        _02_异常退出法 class_00 = new _02_异常退出法("class_00");
        class_00.start();
        _02_异常退出法.sleep(200);
        class_00.interrupt();
    }
}
