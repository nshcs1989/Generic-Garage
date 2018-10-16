public class MainGarage
{

    public static void main(String[] args)
    {
        final int MAX_NUM_OF_CARS=5;
        Garage<Vehicle> g = new Garage<>(MAX_NUM_OF_CARS);
        PrivateVehicle c1=new PrivateVehicle("9304123","KIA", 2015,"Private Vehicle","Netanel");
        PrivateVehicle c2=new PrivateVehicle("9304133","TOYOTA", 2005,"Private Vehicle","Michal");
        LeesingVehicle c3=new LeasingVehicle("9304153","Citroen", 2018,"Leesing Vehicle","TEVA","Reut");
        PrivateVehicle c4=new PrivateVehicle("9304163","Renault", 2016,"Private Vehicle","Adam");
        LeesingVehicle c5=new LeasingVehicle("9304113","Hyundai", 2018,"Leesing Vehicle","IBM","Assaf");
        PrivateVehicle c6=new PrivateVehicle("9504123","Citroen", 2013,"Private Vehicle","Noga");
        try
        {
            g.add(c1);
            g.add(c2);
            g.add(c3);
            g.add(c4);
            g.add(c5);
            g.add(c6);

        }
        catch(GarageException e)
        {
            System.out.println("\n"+e.getMessage()+"\n");
        }

        Vehicle afterWork=g.work();
        System.out.println("Below is the details of the vehicle that was treated in the garage:");
        System.out.println(afterWork);
        System.out.println("Below is the details of the vehicle that was remove from the line in the garage according car's number 9304153:");
        Vehicle afterRemove= g.remove("9304153");
        System.out.println(afterRemove);
        System.out.println("The number of cars in the line is: ");
        System.out.println(g.size());
        System.out.println("\nThose are the details of the cars which still waiting in line:");
        System.out.println(g);
    }


}
