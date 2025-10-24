package com.campusdual.classroom;

import com.campusdual.Utils;
import jdk.jshell.execution.Util;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car (String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car(){
        this.brand = "Citroën";
        this.model = "Xsara";
        this.fuel = "Diesel";
    }

    public void start() {
        if (isTachometerEqualToZero() && this.gear == "N"){
            this.tachometer = 1000;
            System.out.println("Your vehicle is on");
        }else{
            System.out.println("Your vehicle is already on");
        }
    }

    public void stop() {
        if (this.speedometer == 0 && this.gear == "N"){
            this.tachometer = 0;
            System.out.println("Your car is off");
        }else{
            System.out.println("Can't turn vehicle off. It must be stopped first");
        }
    }
    public void accelerate(){
        if(this.tachometer >= 1000 && this.speedometer >= 0) {
            this.gear = "D";
            if (this.speedometer < MAX_SPEED){
                this.speedometer = this.speedometer + 5;
                System.out.println("Speed: " + this.speedometer + " km/h");
            } else {
                System.out.println("Max. speed cannot be exceeded");
            }
        } else {
            System.out.println("Turn on your vehicle");
        }
    }

    public void brake(){
        if (this.speedometer > 0) {
            this.speedometer = this.speedometer - 5;
            System.out.println("Speed: " + this.speedometer + " km/h");
        } else {
            System.out.println("You're stopped :)");
        }
    }

    public void turnAngleOfWheels(int angle) {
        int total_angle = this.wheelsAngle + angle;

        if (total_angle >= -45 && total_angle <= 45) {
            this.wheelsAngle += angle;
        } else {
            System.out.println("You can't turn wheels further");
            if (angle > 0) {
                this.wheelsAngle = 45;
            } else {
                this.wheelsAngle = -45;
            }
        }
        System.out.println("Wheels Angle: " + this.wheelsAngle);
    }

        public String showSteeringWheelDetail () {
            return "";
        }

        public boolean isReverse () {
           return this.reverse;
        }

        public void setReverse (boolean reverse){
            if (this.speedometer == 0 && isTachometerGreaterThanZero()) {
                this.gear = "R";
                this.reverse = reverse;
            } else {
                System.out.println("Stop your vehicle first");
                this.reverse = false;
            }
        }

        public void showDetails () {

        }

        public boolean isTachometerGreaterThanZero () {
            if (this.tachometer > 0) {
                System.out.println("Revolutions per minute: " + this.tachometer);
                return true;
            } else {
                System.out.println("Your tachometer is at zero");
                return false;
            }
        }

        public boolean isTachometerEqualToZero () {
            if (this.tachometer == 0) {
                System.out.println("Your tachometer is at zero");
                return true;
            } else {
                System.out.println("Revolutions per minute: " + this.tachometer);
                return false;
            }
        }

        public static void main (String[]args){

        }


    }
