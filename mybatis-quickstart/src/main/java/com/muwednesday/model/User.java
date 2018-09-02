package com.muwednesday.model;

import lombok.Data;

import java.util.Date;

/**
 * Description:
 *
 * @author Xinwen
 * @date 2018/9/2
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Date date;
    private String sex;
    private String underlineTest;
}
