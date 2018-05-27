package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * author: youhh
 * date: 2018/5/27 下午10:15
 * description:
 */
@RestController
public class GirlController {


    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> getList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl add(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = false) Integer age) {
        Girl girl = new Girl();
        girl.setName(name);
        girl.setAge(age);
        return girlRepository.save(girl);
    }


    @GetMapping(value = "/girls/{id}")
    public Girl queryById(@PathVariable(value = "id") Integer id) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName("java");
//        return girlRepository.findOne(girl);
        Optional<Girl> byId = girlRepository.findById(id);
        return girl;
    }

    @PutMapping(value = "/girls/{id}")
    public Girl update(@PathVariable(value = "id") Integer id, @RequestParam(value = "name") String name, @RequestParam(value = "age") Integer age) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setAge(age);
        return girlRepository.save(girl);
    }


    @DeleteMapping(value = "/girls/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        girlRepository.deleteById(id);
    }

    @GetMapping(value = "girls/age/{age}")
    public List<Girl> queryByAge(@PathVariable(value = "age") Integer age) {
        List<Girl> girls = girlRepository.findByAge(age);
        return girls;
    }


}
