package com.ll.Service;

import com.ll.dto.dto;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<dto> list = new ArrayList<>();

    //등록하기
    public boolean Registration(dto re) {
        return list.add(re);
    }

    //목록조회
    public List<dto> listAll() {
        return list;
    }

    //삭제
    public int listId(int id) {
        for (int i = 0; i < list.size(); i++) {
            dto listsize = list.get(i);

            if (listsize.getNumbers() == id) {
                return i;
            }
        }

        return -1;
    }
}
