package dapeng.mapper;

import dapeng.pojo.classes;
import dapeng.pojo.classesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface classesMapper {
    int countByExample(classesExample example);

    int deleteByExample(classesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(classes record);

    int insertSelective(classes record);

    List<classes> selectByExample(classesExample example);

    classes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") classes record, @Param("example") classesExample example);

    int updateByExample(@Param("record") classes record, @Param("example") classesExample example);

    int updateByPrimaryKeySelective(classes record);

    int updateByPrimaryKey(classes record);
}