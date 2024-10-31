class RangeRover extends Car {
    public RangeRover(String colour, String licencePlate) {
        super(colour, licencePlate);
    }


    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public String getType() {
        return "RangeRover";
    }

    @Override
    public String toString() {
        return "Colour: " + colour + " by " + licencePlate + (isRented ? " (Rented)" : " (Available)");
    }


}



