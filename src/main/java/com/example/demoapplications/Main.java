package com.example.demoapplications;


import java.util.Map;


public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Injector injector = new Injector();
        injector.setFieldDependency();

        Map<Class,Object> sets = injector.getiocContainer();
        System.out.println(sets.entrySet());
        try {
            injector.getBean(ClassTwo.class);
        } catch (BeanNotFoundException e) {
            throw new RuntimeException(e);
        }
       // System.out.println(result.keySet());
    }

}
