package com.example.DistributedComputing.Models;

public class DistributingComputingConfiguration {
    private int value1;
    private int value2;
    private int port;

    public DistributingComputingConfiguration(){

    }

    public DistributingComputingConfiguration(int value1, int value2, int port) {
        this.value1 = value1;
        this.value2 = value2;
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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
