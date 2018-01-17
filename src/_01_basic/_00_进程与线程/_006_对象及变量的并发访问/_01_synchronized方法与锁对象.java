package _01_basic._00_进程与线程._006_对象及变量的并发访问;

public class _01_synchronized方法与锁对象 extends Thread {

    _01_synchronized方法与锁对象(final String name) {
        super();
        this.setName(name);

        class_00 = new _99_引用_test_00();
    }

    private _99_引用_test_00 class_00;

    @Override
    public void run() {
        class_00.run();
    }

    public static void main(String[] args) {

        _01_synchronized方法与锁对象 class_00 = new _01_synchronized方法与锁对象("class_00");
        _01_synchronized方法与锁对象 class_01 = new _01_synchronized方法与锁对象("class_02");
        class_00.start();
        class_01.start();
        ;
    }
}
