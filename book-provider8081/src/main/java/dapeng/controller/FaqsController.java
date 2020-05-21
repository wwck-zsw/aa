package dapeng.controller;

import dapeng.pojo.Faqs;
import dapeng.service.FaqsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MI on 2020/5/21.
 */
@RestController
public class FaqsController {
    @Resource
    private FaqsService faqsService;
    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    public List<Faqs> selectAll(@RequestParam(value = "title",required = false) String title){
        return faqsService.selectAll(title);
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(@RequestBody Faqs faqs){
        return faqsService.save(faqs)>0?"success":"error";
    }
    @RequestMapping(value = "selectById",method = RequestMethod.GET)
    public Faqs selectById(@RequestParam("id") Integer id){
        return  faqsService.selectById(id);
    }
}
