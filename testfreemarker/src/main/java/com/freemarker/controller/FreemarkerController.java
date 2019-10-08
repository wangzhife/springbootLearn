package com.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Package: com.freemarker.controller
 * @ClassName: FreemarkerController
 * @Date: 2019/10/8 13:22
 */
@RequestMapping("/freemarker")
@Controller
public class FreemarkerController {
    @RequestMapping("test1")
    public String freemarker(Map map){
        map.put("name","程序员");
        //map在request域中会被返回，map就是freemarker模板所使用的数据
        //返回freemarker模板的位置，基于resources/templates路径的
        return "test1";
    }
}
