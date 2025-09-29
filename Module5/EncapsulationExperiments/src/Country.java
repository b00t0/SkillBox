public class Country {
    private String name;
    private int population;
    private double square;
    private String capital;
    private boolean accessToTheSea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getSquare() {
        return square;
    }

    public String getCapital() {
        return capital;
    }

    public boolean isAccessToTheSea() {
        return accessToTheSea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setAccessToTheSea(boolean accessToTheSea) {
        this.accessToTheSea = accessToTheSea;
    }
}
