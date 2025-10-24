package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        // Un método booleano que verifique si el valor del tacómetro es cero
        Car myCar = new Car();
        System.out.println(myCar.isTachometerEqualToZero());

        // Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        myCar.start();

        // Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        myCar.start();

        // Apagar el coche comprobando que el valor del tacómetro es correcto
        myCar.stop();

        // Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        myCar.start();
        for (int i = 0; i < 4; i++) {
            myCar.accelerate();
        }
        myCar.stop();

        // Acelerar el coche
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
        }

        // Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        for (int i = 0; i < 10; i++) {
            myCar.accelerate();
        }

        // Frenar la velocidad
        myCar.brake();

        // Frenar hasta un valor negativo (y comprobar que no se puede)
        for (int i = 0; i < 20; i++) {
            myCar.brake();
        }

        // Girar el volante 20 grados
        myCar.turnAngleOfWheels(20);

        // Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        myCar.turnAngleOfWheels(60);

        // Detener el coche y poner marcha atrás
        myCar.stop();

        // Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        myCar.start();
        myCar.accelerate();
        myCar.setReverse(true);

    }

}