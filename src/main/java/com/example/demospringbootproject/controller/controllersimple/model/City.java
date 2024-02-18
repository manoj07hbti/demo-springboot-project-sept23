package com.example.demospringbootproject.controller.controllersimple.model;

public class City {

    String name;
    double population;
    String Famous;
    String Mall;

    public City(String name, double population, String famous, String mall) {
        this.name = name;
        this.population = population;
        Famous = famous;
        Mall = mall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getFamous() {
        return Famous;
    }

    public void setFamous(String famous) {
        Famous = famous;
    }

    public String getMall() {
        return Mall;
    }

    public void setMall(String mall) {
        Mall = mall;
    }
}
