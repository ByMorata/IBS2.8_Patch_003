package _01_basic._00_进程与线程._005_线程优先级;

public class _03_运行速度比较 extends Thread {

    _03_运行速度比较(final String threadName) {
        super();
        this.setName(threadName);
    }
    private int i = 0;
    @Override
    public void run() {

        while (true) {
            i++;
        }
    }

    public int getCount() {
        return this.i;
    }

    public static void main(String[] args) throws InterruptedException {

        _03_运行速度比较 class_00 = new _03_运行速度比较("class_00");
        _03_运行速度比较 class_01 = new _03_运行速度比较("class_01");

        class_00.setPriority(NORM_PRIORITY + 4);
        class_01.setPriority(NORM_PRIORITY + 3);
        class_00.start();
        class_01.start();
        Thread.sleep(2000);
        class_00.stop();
        class_01.stop();
        System.out.println();
        System.out.println(class_00.getName() + " : " + class_00.getCount());
        System.out.println(class_01.getName() + " : " + class_01.getCount());
        class_00.setDaemon(true);
    }
}
