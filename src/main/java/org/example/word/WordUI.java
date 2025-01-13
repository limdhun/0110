package org.example.word;

import java.util.Scanner;

//문제를 푸는 기능
//로직 위주의 객체 - 인스턴스 변수
//여러 메서드에서 사용.
//메소드의 결과를 계속 보관하는 경우
//얘의 협력자, 조력자가 인스턴스 변수가 됨. ?
// 한번 만들어서 여러 번 사용하는 객체도 인스턴스 변수가 됨
public class WordUI {
//UI는 보통 void
    
    //의존성 주입
    private WordService service;
    public WordUI(WordService serviceObj){
        
        this.service = serviceObj;
    }
    
    public void exam(){
        //답을 맞추면 다음 문제, 답 틀리면 그만
        //계속 scanner로 입력받아야 함
        //얘는 UI. exam 말고도 다른 메소드에서도 scanner가 필요할 수 있으므로, 이 메소드 밖에서 인스턴스 변수로 선언하여 이 객체 내에서 사용할 수 있도록 함
        Scanner scanner = new Scanner(System.in);
        WordVO word = this.service.getNextWord();
        System.out.println(word.getKor());
        String answer = scanner.nextLine();
        if(answer.equals(word.getEng())){
            System.out.println("Correct!");
        }else {
            System.out.println("Wrong!");
        }



    }
}
