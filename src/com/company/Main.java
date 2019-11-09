package com.company;

public class Main {

    public static void main(String[] args) {

        int pid = 1;
        String name = "IphoneX";
        double price = 1500;

        int pid2 = 2;
        String name2 = "Iphone7";
        double price2 = 1200;

        int pid3 = 3;
        String name3 = "Iphone6";
        double price3 = 900;
        String os = "iOS";
        int ram = 4;
        int sdCardSize = 20;

        Product product1 = new Product();
        //System.out.println("Product is: " + product1);
        product1.setProductDetails(pid, name, price);
        product1.showProductDetails();

        Product product2 = new Product();
        //System.out.println("Product is: " + product2);
        product2.setPid(pid2);
        System.out.println("Product ID: " + product2.getPid() + "-------");
        product2.setName(name2);
        System.out.println("Product Name: " + product2.getName() + "-------");
        product2.setPrice(price2);
        System.out.println("Product Price: " + product2.getPrice() + "-------");

        //Requesting to get mobile object constructor
        Mobile mobile = new Mobile();
        //Product Object to gets constructed before the Mobile Object constructed !! Rule to Inheritance (Object to Object)
        //System.out.println("Product is " + mobile);
//        mobile.setProductDetails(pid3, name3, price3);
//        mobile.showProductDetails();
        mobile.setProductDetails(pid3, name3, price3, os, ram, sdCardSize);
        mobile.showProductDetails();
    }
}

//Inheritance in Java
//have 3 types: Single, Multiple, Hierarchical
//Single: enable child inherit properties and behaviour from a single parent class. Ex: Class A <= Class B
//Multiple: enable child inherit from parent class and also another class. Ex: Class A <= Class B <= Class C
//Hierarchical: enable multiple children to inherit from parent class
//              <= Class C
// Ex: Class A  <= Class B
//              <= Class D

//Polymorphism in Java
//polymorphism is the property of an object which allows it to take multiple forms
//it has 2 : Compile Time and Run Time
// + Compile Time: Compile Time polymorphism or static polymorphism is resolved during compile time
//Overloading is an example of compile time polymorphism
// Rules for Overloading
// 1. Overload methods must have different argument list
// 2. It can have different return types if argument list is different
// 3. It can throw different exceptions
// 4. It can have different access modifiers
// + Run Time: Run Time polymorphism or dynamic polymorphism is resolved during run time
// Method Overloading is an example of run time polymorphism
// An overridden method is call through the reference variable of a superclass
// Rules for Overloading
// 1. Overriding method argument list must match the overridden method
// 2. The return type must be the same or subtype of overridden method
// 3. Access level cannot be more restrictive than overridden method

//Abstraction in Java
// Abstraction is the methodology of hiding the implementation details from the user and only the functionality to them
// there are two ways to achieve: Abstract Class and Interface Class
// + Abstract class is a template definition to methods and variables of a class that contains one or more abstract method
// It can provide from 0 to 100% of abstraction
// Must be declare with an abstract keyword
// Can have abstract and non-abstract method
// Cannot be instantiated
// Can have constructors and static methods
// Can have final methods
// + Interface in java is a blueprint of a class which contains static constants and abstract methods
// It enables multiple inheritance and helps in achieving loose coupling
// It provide 100% of abstraction
// Ex: Class extends Class
//     Class implement Interface
//     Interface extends Interface

//Encapsulation in Java
// Encapsulation is the mechanism of wrapping up of data and code acting on the methods together as a single unit
// It is achieved by declaring the variables of a class as private and then providing the public setter and getter methods to
// modify and view the variables values
//