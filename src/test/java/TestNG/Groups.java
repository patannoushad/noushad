package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Groups {

        @Test(groups = {"sanity"})
        void test1class1(){
            System.out.println("test 1 class 1 testcase 1");
        }
        @Test(groups = {"regression"})
        void test1class2() {
            System.out.println("test 1 class 1 testcase 2");
            Assert.assertEquals(1,1);
        }
        @Test(groups = {"sanity","regression"})
        void test1class3(){
            System.out.println("test 1 class 1 testcase 3");
        }
        @Test(groups = {"sanity","regression","smoke"})
        void test1class4(){
            System.out.println("test 1 class 1 testcase 4");
        }
        @BeforeTest(groups = {"smoke"})
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

