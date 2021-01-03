package com.example.DistributedComputing.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("distributed-computing")
@Component
public class Configuration {
    private int value1;
    private int value2;

    public Configuration(){
        this.value2 = 255;
        this.value1 = 23;
    }

    public Configuration(int value1, int value2) {
        super();
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
