package com.lhj;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author lhj
 * @Classname MyMessageProcessor
 * @Description 使用反射处理注解
 * @Date 2020/12/24 14:41
 * @Version V1.0
 */
public class MyMessageProcessor {

    public static void main(String[] args) {

        try {
            //加载使用注解的类
            Class clazz = MyMessageProcessor.class.getClassLoader().loadClass("com.lhj.AnnotationTest");

            //获取所有的属性
            Field[] fields = clazz.getDeclaredFields();
            //遍历属性
            for (Field field : fields) {
                ////判断属性是否带有MyMessage注解
                if (!field.isAnnotationPresent(MyMessage.class)) {
                    continue;
                }
                MyMessage annotation = field.getAnnotation(MyMessage.class);
                System.out.println("name: " + annotation.name() + " num: " + annotation.num() + " desc: " + annotation.desc());

            }

            //获取类中的方法
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (checkAnnotation(method)) continue;
                MyMessage annotation = method.getAnnotation(MyMessage.class);
                System.out.println("name: " + annotation.name() + " num: " + annotation.num() + " desc: " + annotation.desc());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }


    }

    /**
     * 判断方法是否带有MyMessage注解
     * @param method
     * @return
     */
    private static boolean checkAnnotation(Method method) {
        if (!method.isAnnotationPresent(MyMessage.class)) {
            return true;
        }
        return false;
    }
}
