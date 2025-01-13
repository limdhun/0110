package org.example.word;

public class WordVO {
    //데이터 위주 클래스.
    //오늘은 구현을 다 하진 않을거임.
    //UI, Service 둘 다 사람이라고 생각.
    //인스턴스가 많지 않도록 할거임. 월요일에 enum 쓰는거 배울거임.
    //메소드를 쓰는게 우선. 워드서비스는 다음 단어를 하나씩 전달해주는 기능
    //
    private String kor;
    private String eng;

    public WordVO(String kor, String eng) {
        this.eng = eng;
        this.kor = kor;
    }

    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return "WordVO{" +
                "kor='" + kor + '\'' +
                ", eng='" + eng + '\'' +
                '}';
    }
}
