package com.company;

class Product {
    // Attributes (State)
//    private int pid;
//    private String name;
//    private double price;

    int pid;
    String name;
    double price;

    // Constructor
    Product() {
        System.out.println(">> Product Object Constructed");
    }

    // Methods (Behavior)
    // To write data in Product Object we have this method
    void setProductDetails(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        System.out.println(">> Data written in Product Object");
    }

    // To read data from Product Object
    void showProductDetails() {
        System.out.println("Product ID: " + pid + "-------");
        System.out.println("Product Name:\t" + name + "-------");
        System.out.println("Product Price:\t" + price + "-------");
    }

    //Setter
    void setPid(int pid) {
        // this mean reference to obj
        this.pid = pid;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    //Getter
    int getPid() {
        return pid;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

}


