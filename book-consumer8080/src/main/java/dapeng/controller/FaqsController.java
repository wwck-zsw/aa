package dapeng.controller;

import dapeng.client.FaqsClient;
import dapeng.pojo.Faqs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MI on 2020/5/21.
 */
@Controller
public class FaqsController {
    @Resource
    private FaqsClient faqsClient;
    @ResponseBody
    @RequestMapping(value = "selectAll",method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public List<Faqs> selectAll(String title){
        return faqsClient.selectAll(title);
    }
    @RequestMapping(value = "toList",method =RequestMethod.GET)
    public String toList(){
        return "book_list";
    }
    @ResponseBody
    @RequestMapping(value = "save",method =RequestMethod.POST)
    public String save(Faqs faqs){
        return faqsClient.save(faqs);
    }
    @ResponseBody
    @RequestMapping(value="selectById",method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    public Faqs selectById(Integer id){
        return faqsClient.selectById(id);
    }
}
