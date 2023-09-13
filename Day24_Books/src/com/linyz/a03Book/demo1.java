package com.linyz.a03Book;

// 动态代理

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 1. 创建接口
interface Hello {
    void sayHello();
}

// 2. 创建实际类
class HelloWorld implements Hello {
    public void sayHello() {
        System.out.println("Hello, World!");
    }
}

// 3. 创建InvocationHandler实现类
class MyInvocationHandler implements InvocationHandler {
    private Hello hello;

    public MyInvocationHandler(Hello hello) {
        this.hello = hello;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoking sayHello()");
        Object result = method.invoke(hello, args);
        System.out.println("After invoking sayHello()");
        return result;
    }
}

public class demo1 {
    public static void main(String[] args) {
        // 4. 创建代理对象
        Hello hello = new HelloWorld();
        InvocationHandler handler = new MyInvocationHandler(hello);
        Hello proxy = (Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                handler
        );

        // 5. 通过代理对象调用方法
        proxy.sayHello();
    }
}

