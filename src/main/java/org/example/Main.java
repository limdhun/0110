package org.example;

import org.example.save.SaveService;
import org.example.save.SaveUI;
import org.example.word.WordService;
import org.example.word.WordUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SaveUI ui = new SaveUI();
        //ui.doJob();

        //이게 의존성 주입
        WordService wordService = new WordService();
        WordUI wordUI = new WordUI(wordService);
        wordUI.exam();


    }
}