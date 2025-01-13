package org.example.save;

public class SaveService {
    //로직 위주의 클래스. 입출력 기능 구현을 위해 만듦
    //메소드부터 설계를 잡아야 함.
    public int balance;


    public int in(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int out(int amount){
        this.balance -= amount;
        return this.balance;
    }
}
