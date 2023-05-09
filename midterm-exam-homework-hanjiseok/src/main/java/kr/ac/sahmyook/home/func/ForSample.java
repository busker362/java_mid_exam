package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1To10(){
        System.out.println("sum1To10() 실행");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10까지 정수들의 합계: " + sum);
    }
    public void sumEven1To100(){
        System.out.println("sumEven1To100() 실행");
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1~100사이의 짝수들의 합계: " + sum);
    }
    public void oneGugudan(){
        System.out.println("oneGugudan() 실행");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    public void sumMinToMax(){
        System.out.println("sumMinToMax() 실행");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(min + "부터 " + max + "까지의 합계: " + sum);
    }
    public void printStar(){
        System.out.println("printStar() 실행");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void printNumberStar(){
        System.out.println("printNumberStar() 실행");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public void printTriangleStar(){
        System.out.println("printTriangleStar() 실행");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        if (rows > 0) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= -rows; i++) {
                for (int j = -rows + i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    public void guguDan(){
        System.out.println("guguDan() 실행");
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
