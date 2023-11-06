package com.ll.run;

import java.util.Scanner;

public class App {
    String input = "";
    private Scanner scanner;

    public App() {
        scanner = new Scanner(System.in);
    }


    public void run() {
        System.out.println("== 명언 앱 ==");

        do {
            System.out.print("명령) ");
            String input = scanner.nextLine();
            switch (input) {
                case "종료":
                    System.out.println("");
                    return;
                case "등록":
                    break;
                case "목록":
                    break;
                case "삭제":
                    break;
                case "수정":
                    break;
            }
        } while (!input.equals("종료"));
    }
}