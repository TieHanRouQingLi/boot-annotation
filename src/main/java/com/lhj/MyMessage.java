package com.lhj;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



/**
 * @Target、@Retention、@Inherited、@Documented为元注解（meta-annotation），它们是负责注解其他注解的。
 */

/**
 * 1.Target：指明注解支持的使用范围，取值可以参考枚举ElementType，以下：
*       ElementType.TYPE //类、接口、枚举
*       ElementType.FIELD //属性
*       ElementType.METHOD //方法
*       ElementType.PARAMETER //参数
*       ElementType.CONSTRUCTOR //构造器
*       ElementType.LOCAL_VARIABLE //局部变量
*       ElementType.ANNOTATION_TYPE //注解
*       ElementType.PACKAGE //包
 * 2.Retention：指明注解保留的的时间长短，取值参考枚举RetentionPolicy，一下：
 *      SOURCE //源文件中保留
 *      CLASS //class编译时保留
 *      RUNTIME //运行时保留
 * 3.Inherited：指明该注解类型被自动继承。如果一个annotation注解被@Inherited修饰，那么该注解作用于的类 的子类也会使用该annotation注解。
 * 4.Documented：指明拥有这个注解的元素可以被javadoc此类的工具文档化。
 */

/**
 * @author lhj
 * @Classname MyMessage
 * @Description 注解类
 * @Date 2020/12/24 14:21
 * @Version V1.0
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyMessage {

    String name() default "sam";

    int num() default 0;

    String desc();

}
