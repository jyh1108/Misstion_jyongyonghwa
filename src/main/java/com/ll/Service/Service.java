package com.ll.Service;

import com.ll.dto.dto;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<dto> list = new ArrayList<>();

    //등록하기
    public boolean Registration(dto re){
        return list.add(re);
    }
    
    //목록조회
    public List<dto> listAll(){
        return list;
    }
}
