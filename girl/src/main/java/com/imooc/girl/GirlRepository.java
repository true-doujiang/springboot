package com.imooc.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * author: youhh
 * date: 2018/5/27 下午10:12
 * description:
 */
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    public List<Girl> findByAge(Integer age);
}
