package kr.ac.sahmyook.home.func;

import java.util.ArrayList;
import java.util.List;
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
        Scanner sc = new Scanner(System.in);
        String[] menu = { "와퍼", "기네스버거", "스태틱 와퍼", "콰트로치즈 와퍼"};
        int[] price = { 7500, 8500, 6900, 5000 };
        List<String> orderList = new ArrayList<>();
        int total = 0;
        do {
            System.out.println("====== 버거킹 메뉴 ======");
            System.out.println("와퍼 : 7500");
            System.out.println("기네스 와퍼 : 8500");
            System.out.println("스태틱 와퍼 : 6900");
            System.out.println("콰트로치즈 와퍼 : 5000");
            System.out.println("5. 주문 완료");
            System.out.println("0. 종료");

            System.out.println("메뉴 선택(번호 입력) :");
            int Num = sc.nextInt();

            if(Num >= 1 && Num <= 4) {
                String order = menu[Num -1];
                orderList.add(order);
                total += price[Num-1];
                System.out.println(order + " 주문");
            } else if (Num == 5){
                System.out.println("주문 완료");
                System.out.println("주문 목록" + orderList);
                System.out.println("총 가격 :" + total + "원");
                break;
            } else System.out.println("없는 메뉴입니다.");
        } while(true);
    }
    public void isStringAlphabet(){
        System.out.println("isStringAlphabet() 실행");
        Scanner sc = new Scanner(System.in);

        String input;
        boolean enOrkr;

        do{
            System.out.println("문자열을 입력해주세요");
            input = sc.nextLine();
            enOrkr = true;

            for(int i = 0; i < input.length();i++){
                char c = input.charAt(i);

                if(!Character.isAlphabetic(c)){
                    enOrkr = false;
                    break;
                }
            }
            if(enOrkr) {
                System.out.println("입력한 문자열은 모두 영문자입니다.");
            } else {
                System.out.println("입력한 문자열은 모두 영문자입니다.");
            }
        } while (!input.equals("exit"));
        sc.close();
    }
}
