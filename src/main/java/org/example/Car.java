package org.example;

public class Car {
    private Long id;
    private String name;
    private String colour;
    private Engin engin;

    public Car() {
    }

    public Car(Long id, String name, String colour, Engin engin) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.engin = engin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engin getEngin() {
        return engin;
    }

    public void setEngin(Engin engin) {
        this.engin = engin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", colour='").append(colour).append('\'');
        sb.append(", engin=").append(engin);
        sb.append('}');
        return sb.toString();
    }
}
