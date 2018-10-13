public class PrivateVehicle extends Vehicle
{
    /*
    In addition to class Vehicle, in this class we add more details on the vehicle- private vehicleand the name
    of the driver.


    */

    private String _name;

    public PrivateVehicle(String carNumber, String carType, int carDate, String carRemark, String name)
    {
        super(carNumber,carType,carDate,carRemark );
        setName(name);
    }


    //get and set of the driver's name(first name and last name at the same string)
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }


    /*Overiding the toString method which return the details of the worker*/
    @Override
    public String toString()
    {
        return super.toString()+"This is a private car which belongs to: "+getName()+".\n";
    }
}
