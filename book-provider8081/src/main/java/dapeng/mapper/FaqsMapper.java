package dapeng.mapper;

import dapeng.pojo.Faqs;
import dapeng.pojo.FaqsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FaqsMapper {
    int countByExample(FaqsExample example);

    int deleteByExample(FaqsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Faqs record);

    int insertSelective(Faqs record);

    List<Faqs> selectByExample(FaqsExample example);

    Faqs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Faqs record, @Param("example") FaqsExample example);

    int updateByExample(@Param("record") Faqs record, @Param("example") FaqsExample example);

    int updateByPrimaryKeySelective(Faqs record);

    int updateByPrimaryKey(Faqs record);
}