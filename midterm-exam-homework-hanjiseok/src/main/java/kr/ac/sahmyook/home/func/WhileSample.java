package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    public void printUniCode(){
        System.out.println("printUniCode() 실행");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자 하나를 입력하세요(종료: 0): ");
            char ch = sc.next().charAt(0);

            if (ch == '0') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int unicode = ch;
            System.out.println("'" + ch + "'의 유니코드 값은 " + unicode + "입니다.");
        }

        sc.close();
    }
    public void sum1To100(){
        System.out.println("sum1To100() 실행");
        int num = 1;
        int sum = 0;

        while (num <= 100) {
            sum += num;
            num++;
        }

        System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
    }
    public void numberGame(){
        System.out.println("numberGame() 실행");
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;

        while (true) {
            System.out.print("1부터 100사이의 정수를 입력하세요: ");
            int guess = sc.nextInt();

            if (guess == answer) {
                System.out.println("정답입니다!");
                break;
            } else if (guess > answer) {
                System.out.println("더 작은 수를 입력하세요.");
            } else {
                System.out.println("더 큰 수를 입력하세요.");
            }
        }
        sc.close();
    }
    public void countCharacter(){
        System.out.println("countCharacter() 실행");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(종료: q): ");
            String str = sc.nextLine();

            if (str.equals("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int length = str.length();
            System.out.println("입력한 문자열의 길이는 " + length + "입니다.");
        }

        sc.close();
    }
    public void countInChar(){
        System.out.println("countInChar() ㅉ실행");
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();

        System.out.print("찾을 문자를 입력하세요: ");
        char ch = sc.nextLine().charAt(0);

        int count = 0;
        int length = str.length();

        int i = 0;
        while (i < length) {
            if (str.charAt(i) == ch) {
                count++;
            }
            i++;
        }

        System.out.println("문자열 " + str + "에는 문자 " + ch + "가 " + count + "개 있습니다.");
    }
}
