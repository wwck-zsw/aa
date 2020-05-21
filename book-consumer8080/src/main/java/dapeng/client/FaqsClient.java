package dapeng.client;

import dapeng.pojo.Faqs;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by MI on 2020/5/21.
 */
@Repository
@FeignClient(value = "bookprovider8081")
public interface FaqsClient {
    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    public List<Faqs> selectAll(@RequestParam(value = "title",required = false) String title);
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(@RequestBody Faqs faqs);
    @RequestMapping(value = "selectById",method = RequestMethod.GET)
    public Faqs selectById(@RequestParam("id") Integer id);
    }
