package com.icesi.model;

public class Computer implements Comparable<Computer>{
    //Attributes
    private String brand;
    private int ram;
    private int processors;
    private double processingSpeed;
    private char operatingSystem;

    //Relationships (None)

    //Methods
    public Computer(String brand, int ram, int processors, double processingSpeed, char operatingSystem) {
        this.brand = brand;
        this.ram = ram;
        this.processors = processors;
        this.processingSpeed = processingSpeed;
        this.operatingSystem = operatingSystem;
    }


    public String getBrand() {
        return this.brand;
    }

    public int getRam() {
        return this.ram;
    }

    public int getProcessors() {
        return this.processors;
    }

    public double getProcessingSpeed() {
        return this.processingSpeed;
    }

    public char getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public String toString(){
        return "Brand: " + this.brand + ". Ram: " + ram + ". Processors: " + processors + ". Processing Speed: " + processingSpeed + ". Operating System: " + operatingSystem;
    }

    @Override
    public int compareTo(Computer other) {
        return this.brand.compareTo(other.brand);
    }
}
