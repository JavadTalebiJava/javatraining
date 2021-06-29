package com.vitelco.training.cevat;

import com.vitelco.training.model.Car;
import com.vitelco.training.model.Logger;

public class Sample {

    public void myMethod(){

        Logger.info("my program is running");
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
