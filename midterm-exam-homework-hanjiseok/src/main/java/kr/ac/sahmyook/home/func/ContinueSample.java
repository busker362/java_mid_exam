package kr.ac.sahmyook.home.func;

public class ContinueSample {
    public void sumJumpThree(){
        System.out.println("sumJumpThree() 실행");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1~100까지 3의 배수를 뺀 정수들의 합계: " + sum);
    }
    public void rowColJump(){
        System.out.println("rowColJump() 실행");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && j >= 3 && j <= 5) {
                    continue;
                }
                System.out.print(i + "행 " + j + "열\t");
            }
        }
    }
}
