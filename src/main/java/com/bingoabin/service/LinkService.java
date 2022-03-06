package com.bingoabin.service;

import com.bingoabin.bean.Data;
import com.bingoabin.dao.BaseLinkDao;
import com.bingoabin.dao.LinkDao;

import java.util.List;

/**
 * 没有任何业务逻辑的代理
 */
public class LinkService {
    private static BaseLinkDao dao = new LinkDao();

    public static List<Data> findAll(){
       return dao.findAll();
    }

    public static String findById(int id){
        return dao.findById(id);
    }
}
