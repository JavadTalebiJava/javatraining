package com.vitelco.training.model;

public class Math {

    public int sum(int i , int j){
        return i+j;
    }

    public int timesThree(int x){
        return x * 3;
    }

    public void showResult(){
        System.out.println(this.timesThree(8));
    }
}
