public abstract class Vehicle
{

    /*

    The vehicle department represents a vehicle in the garage which absorbs the vehicle number, vehicle type,
    date of vehicle creation and note about the vehicle

    */

    private String _carNumber;
    private String _carType;
    private String _carRemark;
    private int _carDate;

    public Vehicle(String carNumber, String carType, int carDate, String carRemark)
    {
        setCarNumber(carNumber);
        setCarType(carType);
        setCarDate(carDate);
        setCarRemark(carRemark);
    }


    //get and set of car's number
    public String getCarNumber() {
        return _carNumber;
    }

    public void setCarNumber(String carNumber) {
        this._carNumber = carNumber;
    }


    //get and set of the type of the car
    public String getCarType() {
        return _carType;
    }

    public void setCarType(String carType) {
        this._carType = carType;
    }


    //get and set of remark regarding the car
    public String getCarRemark() {
        return _carRemark;
    }

    public void setCarRemark(String carRemark) {
        this._carRemark = carRemark;
    }


    //get and set of the date the car was created
    public int getCarDate() {
        return _carDate;
    }

    public void setCarDate(int carDate) {
        this._carDate = carDate;
    }


    /*Overiding the toString method which return the details of the worker*/
    public String toString()
    {
        return "The number of the car is: "+getCarNumber()+".\nThe type of the car is: "+getCarType()+"." +
                "\nThe year that the car was created was: "+getCarDate()+".\nReamark: "+getCarRemark()+".\n";
    }
}
