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
                    return;
                case "등록":
                    Registration();
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

    private void Registration() {
        int n = 1;
        System.out.print("명언 : ");
        String famous = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        System.out.println(n + "번 명언이 등록 되었습니다.");
    }
}