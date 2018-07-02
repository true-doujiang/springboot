package com.imooc.hotdeploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * author: youhh
 * date: 2018/6/2 下午9:12
 * description:
 */
@RestController
public class ImoocController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say() {
        return "hello ssslll拉limooc";
    }
}
