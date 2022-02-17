package org.launchcode.java.technology;

public class Computer extends AbstractEntity{
    private int ram;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }



    private int storage;
    private String manufacturer= "PineApple";

}
