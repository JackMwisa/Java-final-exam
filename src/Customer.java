public class Customer {
    /**
     * my fields
     */
    private String name;
    private String address;
    private int age;

    // my constructor
    public Customer(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;

    }
    // my getters and setters
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAge(){
        return age;
    }

    


}
