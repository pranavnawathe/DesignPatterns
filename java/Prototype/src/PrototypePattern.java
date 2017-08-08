package exercise;
public class PrototypePattern
{
    public static void main(String[] args)
    {
        try
        {
        	Car baseCar = new Car();
        	baseCar.setName("Focus S");
        	baseCar.printDetails();
        	
        	System.out.println("\n");
            Car otherVersion  = ______________________ //<<3
            otherVersion.setName("Focus SE");
            otherVersion.setAutomaticClimateControl(true);
            otherVersion.setCruiseControl(true);
            otherVersion.printDetails();
           
 
        }
        catch (CloneNotSupportedException e)
        {
        	System.out.println("Object not cloneable");
            e.printStackTrace();
        }
    }
}