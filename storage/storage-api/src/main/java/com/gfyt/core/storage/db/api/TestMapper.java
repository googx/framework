package com.gfyt.core.storage.db.api;

import com.gfyt.core.bean.entity.Test;
import com.gfyt.core.storage.api.BaseDao;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public interface TestMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    int insert(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    int insertSelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    Test selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    int updateByPrimaryKeySelective(Test record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
    * @date  2018-09-29 16:54:24
    * @author 
     */
    int updateByPrimaryKey(Test record);
}