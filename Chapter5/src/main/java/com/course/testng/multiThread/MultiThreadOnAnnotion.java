package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * Created by yuchen on 2018/11/16
 */
public class MultiThreadOnAnnotion {
    
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
