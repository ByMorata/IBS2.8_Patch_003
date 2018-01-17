package _01_basic._00_进程与线程._005_线程优先级;

public class _01_设置线程优先级 extends Thread {

    _01_设置线程优先级(final String threadName)
    {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {

        System.out.println(this.getName());
    }

    public static void main(String[] args) {

        _01_设置线程优先级 class_00 = new _01_设置线程优先级("class_00");
        _01_设置线程优先级 class_01 = new _01_设置线程优先级("class_01");

        class_00.setPriority(Thread.MIN_PRIORITY);
        class_01.setPriority(Thread.MAX_PRIORITY);
        class_00.start();
        class_01.start();
    }
}
