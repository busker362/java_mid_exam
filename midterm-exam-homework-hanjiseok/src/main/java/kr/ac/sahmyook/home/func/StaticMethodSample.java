package kr.ac.sahmyook.home.func;

import java.util.Random;

public class StaticMethodSample {
    public void testMathRandom(){
        System.out.println("testMathRandom() 실행");
        int randomNum = (int) (Math.random() * 45) + 1;
        System.out.println("랜덤값: " + randomNum);
    }
    public void testMathAbs(){
        System.out.println("testMathAbs() 실행");
        double x = -12.77;
        double absX = Math.abs(x);
        System.out.println("Absolute value of " + x + ": " + absX);
    }
    public void testMathMax(){
        System.out.println("testMathMax() 실행");
        int a = 120;
        int b = 54;
        int max = Math.max(a, b);
        System.out.println("The larger number between " + a + " and " + b + " is " + max);
    }
}
