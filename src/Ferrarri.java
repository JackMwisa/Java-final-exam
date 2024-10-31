public class Ferrarri extends Car {
        public Ferrarri(String colour, String licencePlate) {
            super(colour, licencePlate);
        }


        @Override
        public String getColour() {
            return colour;
        }

        @Override
        public String getType() {
            return "Ferrarri";
        }

        @Override
        public String toString() {
            return "Colour: " + colour + " by " + licencePlate + (isRented ? " (Rented)" : " (Available)");
        }


    }



