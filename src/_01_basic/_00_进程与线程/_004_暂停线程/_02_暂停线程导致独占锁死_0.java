package _01_basic._00_进程与线程._004_暂停线程;

public class _02_暂停线程导致独占锁死_0 {

    public static void main(String[] args) throws Exception {

        final _99_引用_test_01 class_00 = new _99_引用_test_01();
        Thread class_01 = new Thread() {

            @Override
            public void run() {
                class_00.printString();
            }
        };

        class_01.setName("a");
        class_01.start();
        Thread.sleep(1000);

        Thread class_02 = new Thread() {

            @Override
            public void run() {

                System.out.println("thread2启动了,但进入不了printString() 方法！只打印1 个begin");
                System.out.println(" 因为printString方法被a线程锁定并且永远suspend 暂停了！ ");
                class_00.printString();
            }
        };
        class_02.start();
        Thread.sleep(1000);
    }
}
