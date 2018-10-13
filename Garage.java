import java.util.ArrayList;

public class Garage <T extends Vehicle>
{
    private int _numOfCars;
    private ArrayList<T> garageArray;

    public Garage(int numOfCars)
    {
        setNumOfCars(numOfCars);
        garageArray= new ArrayList<>(getNumOfCars());
    }

    public int getNumOfCars() {
        return _numOfCars;
    }

    public void setNumOfCars(int numOfCars) {
        this._numOfCars = numOfCars;
    }


    /*
    The add method adds a vehicle to the garage.
    The vehicle will be added to the end of the line of vehicles awaiting treatment.
    If the size of listArray is over the maximum number of cars an exeption will occure.
    */
    public void add(T obj) throws GarageException
    {
        if (garageArray.size()+1>getNumOfCars())
                throw new GarageException("Your line is full. You can't add another car to line");
        else
                garageArray.add(obj);


    }

    /*
    The "work" method handles the vehicle. The method removes and  returns the first vehicle in the line.
    If there are no vehicles in the line, the method will return "null".
    */
    public T work()
    {
        if (garageArray.isEmpty())
            return null;
        else
        {
            T firstCell=garageArray.get(0);
            garageArray.remove(0);
            return firstCell;
        }

    }

    /*
    The method "remove" get a string from the user that represent car's number.
    This method will remove and return the requsted vehicle.
    If there are no vehicles in the line, the method will return "null".
    */
    public T remove(String license)
    {

        for(int i=0;i<garageArray.size();i++)
        {
            T c1;
            if (garageArray.get(i).getCarNumber().equals(license))
            {
                c1=garageArray.get(i);
                garageArray.remove(i);
                return c1;
            }

        }


        return null;
    }

    /*
    The "size" method returns the number of cars in the line.
    */

    public int size()
    {
        return garageArray.size();
    }

    /*
    The "toString" method returns the details of every car in the line.
    */

    public String toString()
    {

        String str="";
        for (T obj: garageArray)
            str+="\nCar's details:\n"+obj.toString();

        return str;
    }





}
