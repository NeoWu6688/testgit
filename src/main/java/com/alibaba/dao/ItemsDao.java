package com.alibaba.dao;

import com.alibaba.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @wx
 * @version1.0
 */
@Repository("itemsDao")
public interface ItemsDao {
    @Select("select * from items where id = #{id}")
    public Items findById(Integer id);
}
