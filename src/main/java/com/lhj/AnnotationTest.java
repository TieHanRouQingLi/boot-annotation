package com.lhj;

/**
 * @author lhj
 * @Classname AnnotationTest
 * @Description
 * @Date 2020/12/24 14:37
 * @Version V1.0
 */
public class AnnotationTest {

    @MyMessage(num = 10, desc = "参数a")
    private static int a;

    @MyMessage(name = "AnnotatinTest", desc = "测试方法test")
    public void test() {
        System.out.println("test");
    }
}
