/**
 * You are tasked with designing a vehicle rental system. 
 * The system has to manage different types of vehicles (cars, trucks and motorcycles). 
 * It also needs to save information about customers who rent these vehicles.
 * 
 */



public class Vehicle {

    // fields in my vehicle class, licencePlate, Colour pricePerDay,
    private String licencePlate;
    private String colour;
    private int pricePerDay;
    private String status; 
    

    // my constructor
    public Vehicle(String licencePlate, String colour, int pricePerDay){
        this.licencePlate = licencePlate;
        this.colour = colour;
        this.pricePerDay = pricePerDay;
    }

    //getters and setters

    public String getLicencePlate(){
        return licencePlate;
    }

    public String getColour(){
        return colour;
    }



    
    
//get a list of all rentals for a specific vehicle




}