package com.campusdual.classroom;

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
        if (this.tachometer == 0){
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        }else{
            System.out.println("Vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("No se puede apagar el vehículo. Primero tiene que estar detenido");
        }
    }
    public void accelerate(){

    }

    public void brake(){

    }

    public void turnAngleOfWheels(int angle){

    }

    public String showSteeringWheelDetail(){

        return "";
    }

    public boolean isReverse(){

        return false;
    }

    public void setReverse(boolean reverse){

    }

    public void showDetails(){

    }

    public boolean isTachometerGreaterThanZero() {

        return false;
    }

    public boolean isTachometerEqualToZero() {

        return false;
    }

    public static void main(String[] args) {

    }


}
