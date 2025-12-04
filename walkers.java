public class walkers      // Add your class name here!
{
    // 1. write 3 instance variables for class: private type variableName;
    private double avrWalkersPerDay;
    private double avrWalkSpeed; //miles per hour
    private double avrNumOfRunners;
    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public walkers (double avrWalkersPerDay, double avrWalkSpeed, double avrNumOfRunners)
    {
        this.avrWalkersPerDay = avrWalkersPerDay;
        this.avrWalkSpeed = avrWalkSpeed;
        this.avrNumOfRunners = avrNumOfRunners;
    }
    // 3. Write a print() method that uses System.out.println to print out all the instance variables.
    public void print()
    {
        System.out.println (avrWalkersPerDay);
        System.out.println (avrWalkSpeed);
        System.out.println (avrNumOfRunners);
    }
    
    // 4. Create accessor (get) methods for each of the instance variables.
    public double getAvrWalkersPerDay()
    {
        return this.avrWalkersPerDay;
    }
    
    public double getAvrWalkSpeed()
    {
        return this.avrWalkSpeed;
    }
    
    public double getAvrNumOfRunners()
    {
        return this.avrNumOfRunners;
    }

    // 5. Create mutator (set) methods for each of the instance variables.
    public void setAvrWalkersPerDay(double avrWalkersPerDay)
    {
        avrWalkersPerDay = 11.5;
    }
    
    public void setAvrWalkSpeed(double avrWalkSpeed)
    {
        avrWalkSpeed = 3;
    }

    public void setAvrNumOfRunners(double avrNumOfRunners)
    {
        avrNumOfRunners = 6;
    }

    // 6. Create a toString() method that returns all the information in the instance variables.
    public String toString()
    {
        return "there are " + avrWalkersPerDay + " walkers per day in this area, the average walk speed is " + avrWalkSpeed + " and the average number of runners is " + avrNumOfRunners;
    }
    // 7. Write an additional method for your class that takes a parameter.
    // For example, there could be a print method with arguments that indicate how you want to print out
    // the information, e.g. print(format) could print the data according to an argument that is "plain"
    // or "table" where the data is printed in a table drawn with dashes and lines (|).
    public void printformat (double avrWalkersPerDay, double avrWalkSpeed, double avrNumOfRunners)
    {
        System.out.print("____________");
    }
}
    // 8. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls all of the methods that you created above to test them.
    
