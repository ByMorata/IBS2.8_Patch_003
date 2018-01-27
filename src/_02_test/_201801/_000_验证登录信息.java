package _02_test._201801;

import java.util.Scanner;

public class _000_验证登录信息 {


    public static void main(String[] args) {


        Scanner scanner_00 = new Scanner(System.in);

        System.out.println("请输入你的用户名：");
        String string_00 = scanner_00.nextLine();
        System.out.println("请输入你的密码：");
        String string_01 = scanner_00.nextLine();

        if(string_00.trim().equals("laomo") && string_01.trim().equalsIgnoreCase("LinHJ987."))
        {
            System.out.println("恭喜你，登录成功！");
        }
        else {

            System.out.println("不好意思，登录失败！");
        }

    }
}
