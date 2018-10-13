public class LeesingVehicle extends Vehicle
{


     /*
    In addition to class Vehicle, in this class we add more details on the vehicle- company name
    and work's name.


    */


    private String _company;
    private String _workerName;

    public LeesingVehicle(String carNumber, String carType, int carDate, String carRemark,String company ,String workerName)
    {
        super(carNumber,carType,carDate,carRemark);
        setCompany(company);
        setWorkerName(workerName);
    }


   //get and set ot company name
    public String getCompany() {
        return _company;
    }

    public void setCompany(String company) {
        this._company = company;
    }

    //get and set of worker name(first name and last name at the same string)
    public String getWorkerName() {
        return _workerName;
    }

    public void setWorkerName(String workerName) {
        this._workerName = workerName;
    }

    /*Overiding the toString method which return the details of the worker*/
    @Override
    public String toString() {
        return super.toString()+"This is a private car which belongs to: "+getWorkerName()+".\n"
                +"This worker works at: "+getCompany()+".\n";
    }
}
