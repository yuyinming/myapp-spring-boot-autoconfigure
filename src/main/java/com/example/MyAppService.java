package com.example;

public class MyAppService {

    private MyAppProperties myAppProperties;

    public String sayHello(String name) {
        return "Hello " + name + "，" + myAppProperties.getSuffix();
    }

    public MyAppProperties getMyAppProperties() {
        return myAppProperties;
    }

    public void setMyAppProperties(MyAppProperties myAppProperties) {
        this.myAppProperties = myAppProperties;
    }
}
