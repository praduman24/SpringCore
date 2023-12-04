package org.example.engin;


public class EnginBuilder {
    private Long id;
    private String name;
    private Long horsepower;

    public static EnginBuilder getEnginBuilder(){
        return new EnginBuilder();
    }

    public EnginBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public EnginBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EnginBuilder setHorsepower(Long horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getHorsepower() {
        return horsepower;
    }

    public Engin build(){
        return new Engin(this);
    }
}
