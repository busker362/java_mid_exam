package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    public void calculator(){
        System.out.println("calculator() 실행");
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 a를 입력하세요 :");
        int a = sc.nextInt();
        System.out.println("숫자 b를 입력하세요 :");
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        int result = 0;
        switch ( operator ){
            case '+':
                result = a +b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result  = a / b;
                break;
            case '%' :
                result = a % b;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
        }
        System.out.println(result);

    }

    public void fruitPrice(){
        System.out.println("fruitPrice() 실행");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        int price = 0;

        switch (fruit) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 1500;
                break;
            case "딸기":
                price = 2000;
                break;
            case "포도":
                price = 2500;
                break;
            default:
                System.out.println(fruit + "은(는) 판매하지 않습니다.");
                return;
        }

        System.out.println(fruit + "의 가격은 " + price + "원입니다.");
    }
}
