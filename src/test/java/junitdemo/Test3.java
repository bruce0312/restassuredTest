package junitdemo;

import org.junit.*;

public class Test3 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("this is beforeClass test");
    }

    @Before
    public void before(){
        System.out.println("this is before test");
    }


    @Test
    public void fun1(){
        System.out.println("this is a fun1 test");
    }

    @Test
    public void fun2(){
        System.out.println("this is a fun2 test");
    }

    @After
    public void after(){
        System.out.println("this is after test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("this is afterClass test");
    }


    public static void main(String[] args){

    }
}
