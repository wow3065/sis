package org.liudk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by dengke.liu on 2016/08/19.
 */
@Mapper
public interface UserDao {

    @Select("select * from user;")
    public List<User> findAllUser();
}
