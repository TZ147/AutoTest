package com.course.model;

import lombok.Data;

/**
 * Created by yuchen on 2018/12/11
 */
@Data
public class LoginCase {

    private int id;
    private String userName;
    private String password;
    private String expected;
}
