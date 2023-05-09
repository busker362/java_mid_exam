package kr.ac.sahmyook.home.func;

public class BreakSample {
    public void sumBreak(){
        System.out.println("sumBreak() 실행");
        int sum = 0;
        int i = 1;
        while (true) {
            if (i > 100) {
                break;
            }
            sum += i;
            i++;
        }
        System.out.println("1부터 100까지의 합계: " + sum);
    }
    public void guguDanBreak(){
        System.out.println("guguDanBreak() 실행");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == 5) {
                    break;
                }
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
