package com.vitelco.training.cevat;

import com.vitelco.training.model.Car;

public class Sample {

    public void myMethod(){

        //Create two object(instance) of type Car
        Car pourche1 = new Car();
        pourche1.color = "RED";
        pourche1.model = "Carrera GT";

        Car pourche2 = new Car();
        pourche2.color = "BLUE";
        pourche2.model = "Carrera GT";


        pourche1.drive(120);
        pourche2.drive(90);

    }

}
