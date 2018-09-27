package com.gfyt.core.storage.db.api;

import com.gfyt.core.bean.entity.Test1;
import com.gfyt.core.storage.api.BaseDao;
import org.apache.ibatis.annotations.Mapper;


public interface Test1Mapper extends BaseDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    Test1 selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
}