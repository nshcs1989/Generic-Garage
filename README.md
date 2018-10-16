# Generic-Garage
The project was created in order to practice practical generic programming by building a garage queue management system.

The vehicle class is an abstract class that forms a template for both leasing vehicle and private vehicle classes.
The Garage class represnts A generic class for a garage that handles vehicles that expand the abstract class of Vehicle. This class will provide the following services:
1. A constructor who receives the initial value of maximum vehicles for garage treatment.
2. "Add" function that adds a vehicle to the garage. The vehicle is added to vehicles waiting in line for garage treatment. If there is no garage space, GarageException will occur.
3. "Work" function that handls vehicles. The function removes and returns the first vehicle in the queue. If no vehicles are queued, the function returns null.
4. "Remove" function gets a string that represents a vehicle number, removes the vehicle and returns it. There is no such vehicle, the function will return null.
5."Size" function returns the number of vehicles in the queue.
6. "toString" function returns the details of all vehicles in the queue.

The main method checks the functionality of the generic garage: adding vehicles, treatment of vehicles and removing of vehicles.
All the functionalities will be printed to the consol.
