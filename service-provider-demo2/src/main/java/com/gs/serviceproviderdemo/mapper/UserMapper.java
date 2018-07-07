package com.gs.serviceproviderdemo.mapper;

import java.util.Map;
import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Map<String, Object> paramsMap);

    int insert(Map<String, Object> paramsMap);

    int insertSelective(Map<String, Object> paramsMap);

    Object selectByPrimaryKey(Map<String, Object> paramsMap);

    int updateByPrimaryKeySelective(Map<String, Object> paramsMap);

    int updateByPrimaryKey(Map<String, Object> paramsMap);

    //这个方式我自己加的
    List<Map<String,Object>> selectAllUser();


}
