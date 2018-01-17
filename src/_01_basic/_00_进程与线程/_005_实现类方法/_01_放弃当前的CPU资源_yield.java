package _01_basic._00_进程与线程._005_实现类方法;

public class _01_放弃当前的CPU资源_yield extends Thread {
    @Override
    public void run() {
        int i = 100000000;
        long index_00 = System.currentTimeMillis();
        while (i-- > 0) {
            yield();
        }
        long index_01 = System.currentTimeMillis();
        long index_02 = index_01 - index_00;
        System.out.println("浪费 " + index_02 + " ms.");
    }

    public static void main(String[] args) {
        _01_放弃当前的CPU资源_yield class_00 = new _01_放弃当前的CPU资源_yield();
        class_00.start();
        class_00.setPriority(MAX_PRIORITY);
    }
}
