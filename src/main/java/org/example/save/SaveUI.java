package org.example.save;

import java.util.Scanner;

public class SaveUI {
    //객체 안만들고 구현할 수도 잇는데, 그건 다음주에 알려줌!
    private SaveService service;
    private Scanner scanner;
    //생성자 : SaveService가 잇어야 내가 doJob을 할 수 있다! 라는 개념
    //첫번째 방법. new SaveService를 만든다
    //두 번째 방법. 다른 누군가 만든 SaveService를 가지고 돌리는 방법 -> 의존성 주입

    public SaveUI(){
        this.service = new SaveService();
        this.scanner = new Scanner(System.in);
    }

    //1번 누르면 입금,, 2번 출금, -1번 종료..의 기능을 Main이 아니라 UI로 빼기
    public void doJob(){
        int value;
        int current;
        outer:
        while (true) {
            System.out.println("입금 = 1, 출금 = 2, 종료 = -1");
            String oper = scanner.nextLine();
            //최근 스위치는 문자열로도 가능

            inner:
            switch (oper) {
                case "1":
                    System.out.println("얼마를 입금?");
                    value = Integer.parseInt(scanner.nextLine());
                    current = this.service.in(value);
                    System.out.println("현재 잔고는 ::" + current + "원 입니다.");
                    break;
                case "2":
                    System.out.println("얼마를 출금?");
                    value = Integer.parseInt(scanner.nextLine());
                    current = this.service.out(value);
                    System.out.println("현재 잔고는 ::" + current + "원 입니다.");
                    break;
                case "-1":
                    break outer;

            }
        }
    }
}
