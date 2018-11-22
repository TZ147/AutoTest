package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * Created by yuchen on 2018/10/29
 */
@Test(groups = "stu")
public class GroupsOnClass2 {

    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2中的stu2222运行");
    }
}
