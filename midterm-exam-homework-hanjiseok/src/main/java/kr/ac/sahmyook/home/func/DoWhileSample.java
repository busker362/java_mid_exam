package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    public void addDashToken(){
        System.out.println("addDashToken() 실행");
        Scanner sc = new Scanner(System.in);

        String str;
        do {
            System.out.print("문자열을 입력하세요 (종료: q) : ");
            str = sc.nextLine();

            if (!str.equals("exit")) {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < str.length(); i++) {
                    if (i == 0) {
                        sb.append(str.charAt(i));
                    } else {
                        sb.append("-").append(str.charAt(i));
                    }
                }

                System.out.println(sb.toString());
            }
        } while (!str.equals("exit"));

        sc.close();
    }
    public void burgerKingMenu(){
        System.out.println("burgerKingMenu() 실행");
    }
    public void isStringAlphabet(){
        System.out.println("isStringAlphabet() 실행");
    }
}
