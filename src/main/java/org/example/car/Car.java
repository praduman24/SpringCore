package org.example.car;

import org.example.car.CarBuilder;
import org.example.engin.Engin;

//@Component
public class Car {
    //    @Value("1")
    private Long id;
    //    @Value("audi")
    private String name;
    //    @Value("black")
    private String colour;
    //    @Autowired
    private Engin engin;


    public Car(CarBuilder carbuilder) {
        this.id = carbuilder.getId();
        this.name = carbuilder.getName();
        this.colour = carbuilder.getColour();
        this.engin = carbuilder.getEng();
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

    public Engin getEngin() {
        return engin;
    }

    @Override
    public String toString() {
        String sb = "Car{" + "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", engin=" + engin +
                '}';
        return sb;
    }
}
