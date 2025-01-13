package org.example.word;

import java.util.ArrayList;

public class WordService {
    //생성자 : 이걸 실행할 수 있도록 준비할 수 있게 하는 것.
    //단어가 10개가 필요하다> 그럼 생성자에서 단어 10개 준비
    
    //instance variable. 얘가 계속 가지고 있는 데이터 : 인스턴스 변수
    
    private ArrayList<WordVO> wordList;//얘가 계속 유지해야 할 데이터
    
    public WordService(){
        //word 데이터를 유지할 거임, 이 객체가 hold하고 있는 데이터는 word데이터.
        //word데이터 10개 만들면 됨.
        wordList = new ArrayList<>();
        //remove를 시키면 삭제한 요소 이후의 인덱스가 한 칸씩 땡겨와짐
        wordList.add(new WordVO("사과", "apple"));
        wordList.add(new WordVO("바나나", "banana"));
        wordList.add(new WordVO("강아지/개", "dog"));
        


    }
    
    
    //다음 단어를 뽑아주는 기능
    public WordVO getNextWord(){

        WordVO word = null;
        word = wordList.remove(0);//처음엔 사과, 두 번짼 바나나, 세 번쨴 강아지가 나옴. 인덱스가 땡겨와지므로
        //ArrayList add를 할때 저절로 추가되는것처럼..
        //계속 remove를 하다가 요소가 없어지면 indexoutofBound... 가 뜸
        return word;
    }

}
