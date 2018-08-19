package com.tokobuku.impl;

import com.tokobuku.common.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Traveler {

    /* Cara kerja annotation AutoWired ialah mirip dengan autowiring byType */

    /* Autowired by field */
    /**
     * Jika dependency checking tidak menemukan referensi bean yang ingin disuntuk maka, Spring
     * akan melemparkan exception dan untuk menghindari pesan tersebut bisa tambahkan parameter required = false
     */
    /*@Autowired(required = false)*/
    private Vehicle car;
    private String origin;
    private String destination;

    public Traveler() {
    }

    /**
     * Autowired by constructor itu mengambil berdasarkan tipe bean yang ada di file Beans.xml jadi jika ada yang sama tipe-nya
     * maka, tambahkan @Qualifier untuk menunjuk referensi mana yang ingin dituju
     */
    @Autowired
    public Traveler(@Qualifier("theOtherCar") Vehicle car123) {
        System.out.println("**** Constructor is called ****");
        this.car = car123;
    }

    public Vehicle getCar() {
        return car;
    }

    /* Autowired by setter */
    /*@Autowired*/
    public void setCar(Vehicle car456) {
        System.out.println("**** Setter is called ****");
        this.car = car456;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Traveler{" +
                "car=" + car +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }

    public void showCar() {
        System.out.println(car);
    }

    public void startJourney() {
        car.move();
    }

}
