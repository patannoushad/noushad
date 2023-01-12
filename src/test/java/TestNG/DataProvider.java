package TestNG;

import org.testng.annotations.Test;

public class DataProvider{
    @Test(dataProvider = "LogintoDataProvider")

    public void loginTest(String email,String pswd){
        System.out.println(email+"    "+pswd);
    }

    @org.testng.annotations.DataProvider(name="LogintoDataProvider")
    public Object [][] getData(){
         Object[][] data={{"abc@gmail.com","abc"},{"mno@gmail.com","mno"},{"pqr@gmail.com","pqr"}};
         return data;
    }
}