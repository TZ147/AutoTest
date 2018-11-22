package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by yuchen on 2018/11/9
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = "+name+", age = "+age);
    }
}
