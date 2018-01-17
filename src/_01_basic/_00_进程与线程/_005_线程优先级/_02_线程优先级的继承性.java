package _01_basic._00_进程与线程._005_线程优先级;
public class _02_线程优先级的继承性 extends Thread {

    _02_线程优先级的继承性(final String threadName) {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " : " + this.getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        //class_00.setPriority(Thread.MIN_PRIORITY);
        //class_01.setPriority(Thread.MAX_PRIORITY);
        // 比如A线程启动B线程,则B线程的优先级与A是一样
        _02_线程优先级的继承性 class_00 = new _02_线程优先级的继承性("class_00");
        Thread class_01 = new Thread(class_00, "class_01");
        class_00.start();
    }
}
