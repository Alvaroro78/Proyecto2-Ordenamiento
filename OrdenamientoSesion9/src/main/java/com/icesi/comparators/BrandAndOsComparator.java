package com.icesi.comparators;

import com.icesi.model.Computer;

import java.util.Comparator;

public class BrandAndOsComparator implements Comparator<Computer> {

    public BrandAndOsComparator(){

    }

    @Override
    public int compare(Computer computer1, Computer computer2) {
        int result =  computer1.getBrand().compareTo(computer2.getBrand());
        if (result==0){
            return Character.compare(computer1.getOperatingSystem(),computer2.getOperatingSystem());
        } else{
            return result;
        }
    }
}
