package Test1;

import org.testng.Assert;
import org.testng.annotations.*;
//folder
//class
//testcase
public class class1 {
    @Test(groups = {"sanity"},priority = 0)
    void testcase111(){
        System.out.println("test 1 class 1 testcase 1");
    }
    @Test(groups = {"regression"},priority = 1)
    void testcase112() {
        System.out.println("test 1 class 1 testcase 2");
        Assert.assertEquals(1,1);
    }
    @Test(groups = {"sanity","regression"},priority = 2)
    void testcase113(){
        System.out.println("test 1 class 1 testcase 3");
    }
    @Test(groups = {"sanity","regression","smoke"},priority = 3)
    void testcase114(){
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
