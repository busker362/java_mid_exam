package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    public void maxNumber(){
        System.out.println("maxNumber() 실행");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public void minNumber(){
        System.out.println("minNumber() 실행");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
    public void threeMaxMin(){
        System.out.println("threeMaxMin() 실행");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max, min;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        if (a < b) {
            if (a < c) {
                min = a;
            } else {
                min = c;
            }
        } else {
            if (b < c) {
                min = b;
            } else {
                min = c;
            }
        }

        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);
    }
    public void checkEven(){
        System.out.println("checkEven() 실행");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

    }
    public void isPassFail(){
        System.out.println("isPassFail() 실행");


        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();

        int avg = (kor + eng + math) / 3;

        if (kor >= 60 && eng >= 60 && math >= 60 && avg >= 70) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
    public void scoreGrade(){
        System.out.println("scoreGrade() 실행");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80) {
            System.out.println("B학점입니다.");
        } else if (score >= 70) {
            System.out.println("C학점입니다.");
        } else if (score >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }
    public void checkPlusMinusZero(){
        System.out.println("checkPlusMinusZero() 실행");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
    }
    public void whatCaracter(){
        System.out.println("whatCaracter() 실행");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("영어 대문자입니다.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("영어 소문자입니다.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("숫자 문자입니다.");
        } else {
            System.out.println("기타 문자입니다.");
        }

    }
}
