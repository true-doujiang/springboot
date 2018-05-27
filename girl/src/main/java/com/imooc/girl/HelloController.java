package com.imooc.girl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private String age;

    @Value("${birthday}")
    private String birthday;//Date 异常了

    @Value("${content}")
    private String content;


    @Autowired
    private GirlProperties girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object sayHello() {
        return girl.toString();
//        return "hello world";
    }

    @GetMapping(value = {"/hi", "hh"})   //集合映射
    public String hiGirl() {
        return content + " ==== 生日:" + birthday;
    }


    //参数名与路径{name} 相同也需要 @PathVariable
    @RequestMapping(value = "/{name}/say/{id}", method = RequestMethod.GET)
    public Object say(@PathVariable(value = "name") String name, @PathVariable(value = "id") Integer id) {
        System.out.println(name + " say " + id);
        return name + " say " + id;
    }

}
