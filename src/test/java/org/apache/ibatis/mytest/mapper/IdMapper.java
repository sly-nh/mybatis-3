package org.apache.ibatis.mytest.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: xiaohaotian
 * @date: 2023/7/14 14:23
 */
public interface IdMapper {
  @Select("select * from test")
  List<IdDO> select();
}
