package com.icesi.ui;

import com.icesi.model.ComputersSale;

import java.util.ArrayList;

public class Main {
    //Relationships or Atributes (global variables)
    private ComputersSale computersSale = new ComputersSale();

    //Methods
    public void printArrays() {
        ArrayList<ArrayList<String>> sorts = new ArrayList<>();
        computersSale.generateRandomComputers(100);
        computersSale.sortByBrand();
        sorts.add(computersSale.getComputersInfo());
        computersSale.sortByProcessing();
        sorts.add(computersSale.getComputersInfo());
        computersSale.sortByBrandAndOS();
        sorts.add(computersSale.getComputersInfo());
        computersSale.sortByRam();
        sorts.add(computersSale.getComputersInfo());
        computersSale.sortByBrandReverse();
        sorts.add(computersSale.getComputersInfo());
        for(ArrayList<String> s: sorts){
            for(String s1 : s){
                System.out.println(s1);
            }
        }
    }

    public Main(){

    }

    public static  void main(String[] args) {
        Main main = new Main();
        main.printArrays();
    }
}