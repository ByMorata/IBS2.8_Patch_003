package _01_basic._00_进程与线程._002_线程安全与变量实例;
public class _00_实例变量不共享情况 extends Thread {
    private int index_00 = 5;
    public _00_实例变量不共享情况(final String threadName)
    {
        super();
        this.setName(threadName);
    }

    @Override
    public void run() {
        super.run();
        while (index_00-- > 0) {
            System.out.println(Thread.currentThread().getName() + " : " + this.index_00);
        }
    }

    public static void main(String[] args) {
        _00_实例变量不共享情况 class_00 = new _00_实例变量不共享情况("class_00");
        _00_实例变量不共享情况 class_01 = new _00_实例变量不共享情况("class_01");
        _00_实例变量不共享情况 class_02 = new _00_实例变量不共享情况("class_02");
        class_00.start();
        class_01.start();
        class_02.start();
    }
}
