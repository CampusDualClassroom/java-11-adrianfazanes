package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {

        TVRemote remote = new TVRemote("Rojo");


        remote.turnOn();
        System.out.println("TV Encendida: " + remote.on);


        remote.channelUp();
        System.out.println("Canal: " + remote.channel);


        remote.channelDown();
        System.out.println("Canal: " + remote.channel);


        remote.channel = 0;
        remote.channelDown();
        System.out.println("Canal después de intentar bajar: " + remote.channel);


        remote.volumeUp();
        System.out.println("Volumen: " + remote.volume);


        remote.volumeDown();
        System.out.println("Volumen después de bajar: " + remote.volume);


        remote.volume = 0;
        remote.volumeDown();
        System.out.println("Volumen después de intentar bajar: " + remote.volume);

        System.out.println("Color del mando a distancia: " + remote.getColor());

        remote.turnOff();
        System.out.println("TV Apagada: " + remote.on);
    }
}
