package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        String name = "한지석";
        int number = 2018101016;
        System.out.println("당신의 이름은 :" + name + ", 당신의 학생번호는 :" + number + " 입니다.");
    }

    public void empInformation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("학생번호를 입력하세요");
        int number = sc.nextInt();

        System.out.println("당신의 이름은 : " + name + ", 당신의 학생번호는 :" + number + " 입니다.");

    }
}
