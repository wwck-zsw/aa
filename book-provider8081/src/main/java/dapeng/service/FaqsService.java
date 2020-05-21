package dapeng.service;

import dapeng.pojo.Faqs;

import java.util.List;

/**
 * Created by MI on 2020/5/21.
 */
public interface FaqsService {
    List<Faqs> selectAll(String title);
    Integer save(Faqs faqs);
    Faqs selectById(Integer id);
}
