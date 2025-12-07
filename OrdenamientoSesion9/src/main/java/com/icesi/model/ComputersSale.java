package com.icesi.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComputersSale {
    //Attributes (None)

    //Relationships
    private ArrayList<Computer> computers;

    //Methods
    public ComputersSale() {
        this.computers = new ArrayList<>();
    }

    public ArrayList<String> getComputersInfo() {
        ArrayList<String> computersInfo = new ArrayList<>();
        for (Computer computer : this.computers) {
            computersInfo.add(computer.toString());
        }
        return computersInfo;
    }

    public void sortByBrand(){

    }

    public void sortByProcessing(){

    }

    public void sortByBrandAndOS(){

    }

    public void sortByRam(){

    }

    public void sortByBrandReverse(){
        Collections.sort(this.computers, Comparator.reverseOrder());
    }

    public void generateRandomComputers(int quantity){
        String[] brands = {"Dell", "HP", "Lenovo", "Asus", "Acer", "Apple", "MSI"};
        char[] operatingSystems = {'W', 'M', 'L'};

        for (int i = 0; i < quantity; i++) {

            String brand = brands[(int)(Math.random() * brands.length)];
            char os = operatingSystems[(int)(Math.random() * operatingSystems.length)];

            int ram = (int)(Math.random() * 5 + 1) * 4;
            int processors = (int)(Math.random() * 8) + 1;
            double speed = Math.round((1.0 + Math.random() * 3.5) * 10.0) / 10.0;

            Computer c = new Computer(brand, ram, processors, speed, os);
            this.computers.add(c);
        }
    }
}
