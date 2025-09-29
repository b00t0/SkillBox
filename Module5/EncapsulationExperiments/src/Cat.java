public class Cat {
    private String name;
    private double weight;
    private String bride;
    private String sex;
    private boolean isSterilised;

    public Cat(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getBride() {
        return bride;
    }

    public String getSex() {
        return sex;
    }

    public boolean isSterilised() {
        return isSterilised;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBride(String bride) {
        this.bride = bride;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSterilised(boolean sterilised) {
        isSterilised = sterilised;
    }
}
