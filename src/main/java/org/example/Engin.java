package org.example;

public class Engin {
    private Long id;
    private String name;
    private Long horsepower;

    public Engin() {
    }

    public Engin(Long id, String name, Long horsepower) {
        this.id = id;
        this.name = name;
        this.horsepower = horsepower;
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

    public Long getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Long horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Engin{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", horsepower=").append(horsepower);
        sb.append('}');
        return sb.toString();
    }
}
