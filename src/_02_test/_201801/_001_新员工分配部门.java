package _02_test._201801;

import java.util.Scanner;

public class _001_新员工分配部门 {

    public static void main(String[] args) {

        int index_00 = "java".hashCode();
        int index_01 = "c++".hashCode();
        int index_02 = "c".hashCode();

        System.out.println(index_00);
        System.out.println(index_01);
        System.out.println(index_02);


        Scanner scanner_00 = new Scanner(System.in);
        String index_03 = scanner_00.nextLine();

        switch (index_03.hashCode()) {
            case 3254818:
                System.out.println("恭喜你被java部门录取");
                break;
            case 96515:
                System.out.println("恭喜你被c++部门录取");
            case 99:
                System.out.println("恭喜你被c部门录取");
            default:
                System.out.println("抱歉你没有被录取");
        }
    }
}
