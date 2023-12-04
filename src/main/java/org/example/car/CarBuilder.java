package org.example.car;


import org.example.engin.Engin;

public class CarBuilder {
    private Long id;
    private String name;
    private String colour;
    private Engin eng;

    public static CarBuilder getCarBuilder(){
        return new CarBuilder();
    }

    public CarBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public CarBuilder setEng(Engin eng) {
        this.eng = eng;
        return this;
    }

    public Car build(){
        return new Car(this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public Engin getEng() {
        return eng;
    }
}
