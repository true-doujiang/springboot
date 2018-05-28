package com.imooc.girl;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * author: youhh
 * date: 2018/5/27 下午9:59
 * description:
 */
@Data
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer age;

    private Date birthday;

}
