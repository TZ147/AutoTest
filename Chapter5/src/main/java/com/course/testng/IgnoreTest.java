package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by yuchen on 2018/10/29
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ingore1 执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ingore2 执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ingore3 执行！");
    }

}
