package test.java.TestNG.groups;

import org.testng.annotations.Test;

@Test(groups = "stu") //类的测试方法
public class GroupsOnClass1 {

    public void stu1() {
        System.out.println("GroupsOnClass1中的stu111运行");
    }

    public void stu2() {
        System.out.println("GroupsOnClass1中的stu222运行");
    }
}
