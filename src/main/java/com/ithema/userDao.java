package com.ithema;

import com.ithema.domain.user;

import java.util.List;

// 用戶的持久層接口
public interface userDao {

    //查詢所偶操作
    List<user>  findall();
}
