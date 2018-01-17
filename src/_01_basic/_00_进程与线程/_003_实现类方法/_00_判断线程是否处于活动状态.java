package _01_basic._00_进程与线程._003_实现类方法;

public class _00_判断线程是否处于活动状态 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("该线程是否还处于活动状态 _run  : " + this.isAlive());
    }

    public static void main(String[] args) throws Exception {
        _00_判断线程是否处于活动状态 class_00 = new _00_判断线程是否处于活动状态();

        Long string_00 = class_00.getId();
        System.out.println(string_00);

        System.out.println("该线程是否还处于活动状态 _begin: " + class_00.isAlive());
        class_00.start();
        Thread.sleep(1000);
        System.out.println("该线程是否还处于活动状态 _end  : " + class_00.isAlive());
        Thread.sleep(1000);

        System.out.println("该线程是否还处于活动状态 _last : " + class_00.isAlive());
    }
}
