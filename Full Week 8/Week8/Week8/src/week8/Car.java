
package week8;

public class Car {
    //ATTRIBUTES
    private String registration;
    private String colour;
    private String make;
    private String model;
    //CONSTRUCTOR
    public Car(String regIn, String colourIn, String makeIn, String modelIn)
    {
        registration = regIn;
        colour = colourIn;
        make = makeIn;
        model = modelIn;
    }
    //METHODS
    public String getRegistration()
    {
        return registration;
    }
    public String getColour()
    {
        return colour;
    }
    public String getMake()
    {
        return registration;
    }
    public String getModel()
    {
        return colour;
    }
}
