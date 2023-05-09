package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner(){
        System.out.println("testScanner() 실행");
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int intValue = sc.nextInt();
        System.out.println("입력받은 정수: " + intValue);

        System.out.print("실수 입력: ");
        double doubleValue = sc.nextDouble();
        System.out.println("입력받은 실수: " + doubleValue);

        System.out.print("문자열 입력: ");
        String strValue = sc.next();
        System.out.println("입력받은 문자열: " + strValue);

        System.out.print("논리값 입력(true/false): ");
        boolean boolValue = sc.nextBoolean();
        System.out.println("입력받은 논리값: " + boolValue);

        sc.close();
    }
    public void testRandom(){
        System.out.println("testRandom() 실행");
        Random random = new Random();

        int randomInt = random.nextInt(100);
        System.out.println("Random Integer: " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);


    }
}
