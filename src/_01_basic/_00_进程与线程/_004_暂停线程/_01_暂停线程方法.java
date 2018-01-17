package _01_basic._00_进程与线程._004_暂停线程;

public class _01_暂停线程方法 extends Thread {

    _01_暂停线程方法(final String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        _01_暂停线程方法 class_00 = new _01_暂停线程方法("class_00");
        class_00.start();
        System.out.println("A = " + System.currentTimeMillis() + "  i = " + class_00.getId());
        class_00.suspend();
        Thread.sleep(1000);
        System.out.println("A = " + System.currentTimeMillis() + "  i = " + class_00.getId());
        class_00.resume();
        class_00.stop();
    }
}
