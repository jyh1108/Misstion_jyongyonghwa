package com.ll.run;

import com.ll.Service.Service;
import com.ll.dto.Rq;
import com.ll.dto.dto;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner scanner;
    int numbers = 0;
    private Service service = new Service();

    public App() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");

            String cmd = scanner.nextLine();

            Rq rq = new Rq(cmd);

            switch (rq.getAction()) {
                case "종료":
                    return;
                case "등록":
                    Registration();
                    break;
                case "목록":
                    testList();
                    break;
                case "삭제":
                    Delete(rq);
                    break;
                case "수정":
                    Modify(rq);
                    break;
            }
        }
    }
    //수정
    private void Modify(Rq rq) {
    }

    //삭제
    private void Delete(Rq rq) {
        int id = rq.getParamAsInt("id", 0);

        if (id == 0) {
            System.out.println("id를 정확히 입력해주세요.");
            return; // 함수를 끝낸다.
        }

        int index = service.listId(id);

        if (index == -1) {
            System.out.printf("%d번 명언은 존재하지 않습니다.\n", id);
            return;
        }

        service.list.remove(index);

        System.out.printf("%d번 명언을 삭제되었습니다.\n", id);

    }



    //목록
    private void testList() {
        List<dto> list = service.listAll();
        if (!list.isEmpty()) {
            System.out.println("번호 / 작가 / 명언");
            System.out.println("------------------------");
            Collections.reverse(list);
            for (dto d : list) {
                System.out.println(d.getNumbers() + " / " + d.getContent() + " / " + d.getFamous());
            }
        } else {
            System.out.println("글이 존재하지 않습니다.");
        }
    }

    private void Registration() {
        numbers++;
        System.out.print("명언 : ");
        String famous = scanner.nextLine();
        System.out.print("작가 : ");
        String content = scanner.nextLine();
        dto re = new dto(famous, content, numbers);
        if (service.Registration(re)) {

            System.out.println(numbers + "번 명언이 등록 되었습니다.");
        }
    }
}