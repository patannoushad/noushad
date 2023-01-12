package TestNG;

import org.testng.annotations.*;

public class Annotations {

        @Test(priority = 0)
        void test1class1(){
            System.out.println("test 1 class 1 testcase 1");
        }
        @Test(priority = 1)
        void test1class2() {
            System.out.println("test 1 class 1 testcase 2");
        }
        @Test(priority = 2)
        void test1class3(){
            System.out.println("test 1 class 1 testcase 3");
        }
        @Test(priority = 3)
        void test1class4(){
            System.out.println("test 1 class 1 testcase 4");
        }
        @BeforeTest
        void BeforeTest(){
            System.out.println("Before test");
        }
        @AfterTest
        void Aftertest(){
            System.out.println("after test");
        }
        @BeforeMethod
        void beforemethod (){
            System.out.println("before method");
        }
        @AfterMethod
        void aftermethod(){
            System.out.println("After method");
        }
    }


