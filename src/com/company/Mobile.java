package com.company;

// IS-A Relation, Mobile IS-A Product, Mobile is child, Product is Parent
class Mobile extends Product {

    //Additional attributes of Mobile other than Product
    private String os;
    private int ram;
    private int sdCardSize;

    Mobile() {
        System.out.println(">> Mobile Object Constructed ");
    }

    // we have redefine the same method from parent into the child with different inputs
    // we have now 2 methods in the Child, 1 from Parent and 1 Child
    // both are different as in based on inputs (even though name is same)
    // Method Overloading: Same method name with different inputs
    void setProductDetails(int pid, String name, double price, String os, int ram, int sdCardSize) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.os = os;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">> Data written in Product Object");
    }

    // Overriding method
    void showProductDetails(){
        System.out.println("Product ID: " + pid + "-------");
        System.out.println("Product Name:\t" + name + "-------");
        System.out.println("Product Price:\t" + price + "-------");
        System.out.println("Product OS: " + os + "-------");
        System.out.println("Product Ram:\t" + ram + "-------");
        System.out.println("Product SdCardSize:\t" + sdCardSize + "-------");
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSdCardSize(int sdCardSize) {
        this.sdCardSize = sdCardSize;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getSdCardSize() {
        return sdCardSize;
    }
}
