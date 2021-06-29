package com.vitelco.training.model;


public class Car {

    //state: prop, attr, field
    public String color;
    public String model;

    //behavior: method
    public void drive(int speed){
        System.out.println(this.toString() + " is running in "
                    + speed + " speed limit.");
    }


    @Override
    public String toString() {
        return "Car[" +
                "color='" + color +
                ", model='" + model +
                ']';
    }
}
