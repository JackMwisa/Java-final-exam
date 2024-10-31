abstract class Car {
    protected String colour;
    protected String licencePlate;
    protected boolean isRented;

    public Car(String colour, String licencePlate) {
        this.colour = colour;
        this.licencePlate = licencePlate;
        this.isRented = false;
    }

    public String getColour() {
        return colour;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rent() {
        isRented = true;
    }

    public void returnItem() {
        isRented = false;
    }

    public abstract String getType();
}

