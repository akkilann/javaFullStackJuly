package com.online.practice;

import java.lang.reflect.Method;

public class PrintMethods {
    public static void main(String[] args) {
            try {
                // create class object
                //Class classobj = PrintMethods.class;
                Class object = String.class;
                // get list of methods
                Method[] methods = object.getMethods();

                // get the name of every method present in the list
                for (Method method : methods) {

                    String MethodName = method.getName();
                    System.out.println("Name of the method: "
                            + MethodName);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

    // method name setValue
    public static int setValue()
    {
        System.out.println("setValue");
        return 24;
    }

    // method name getValue
    public String getValue()
    {
        System.out.println("getValue");
        return "getValue";
    }

    // method name setManyValues
    public void setManyValues()
    {
        System.out.println("setManyValues");
    }

}
