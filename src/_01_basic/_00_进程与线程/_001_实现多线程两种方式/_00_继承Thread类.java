package _01_basic._00_进程与线程._001_实现多线程两种方式;

public class _00_继承Thread类 extends Thread {

    @Override
    public void run() {

        String string_00 = this.getName();
        String string_01 = Thread.currentThread().getName();

        System.out.println("子线程内的名称为: " + string_00);
        System.out.println("子线程内的名称为: " + string_01);

    }


    public static void main(String[] args) {

        _00_继承Thread类 class_00 = new _00_继承Thread类();
        class_00.setName("继承Thread类名称初始化...");
        System.out.println("当前的进程名称为: " + Thread.currentThread().getName());
        class_00.start();
    }
}
