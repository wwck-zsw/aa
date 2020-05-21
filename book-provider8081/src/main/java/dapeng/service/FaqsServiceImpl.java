package dapeng.service;

import dapeng.mapper.FaqsMapper;
import dapeng.pojo.Faqs;
import dapeng.pojo.FaqsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MI on 2020/5/21.
 */
@Service
public class FaqsServiceImpl implements FaqsService {
    @Resource
    private FaqsMapper faqsMapper;
    @Override
    public List<Faqs> selectAll(String title) {
        FaqsExample faqsExample=new FaqsExample();
        FaqsExample.Criteria criteria=faqsExample.createCriteria();
       if(title!=null&&title!=""){
           criteria.andTitleLike("%"+title+"%");
       }
        return faqsMapper.selectByExample(faqsExample);
    }

    @Override
    public Integer save(Faqs faqs) {
        return faqsMapper.insert(faqs);
    }

    @Override
    public Faqs selectById(Integer id) {
        return faqsMapper.selectByPrimaryKey(id);
    }
}
