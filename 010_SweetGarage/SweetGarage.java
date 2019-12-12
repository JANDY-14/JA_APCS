public class SweetGarage
{
    public static void main(String args[])
    {
        // calss cluste  **public Car(int cYear, int cMilesDriven, String cManufacturerName, String cModelName, boolean cHasTurbo)**      
        Car sportsCar = new Car(1987,10_000,"Ferrari","F40",false);
        Car HyperCar = new Car (2019,10,"Aston martin","valkrie",true);
        Car DailyCar = new Car (2016,30_000,"subaru","wrx sti",true);
        Car OldCar = new Car (1966,15_000,"Lamborgini","muria",false);
        Car FastCar = new Car (2109,1_500,"Buggati","chiron SS 300",true);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println(sportsCar.year);
System.out.println(sportsCar.modelName);
System.out.println(sportsCar.manufacturerName);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
DailyCar.revEngine();
DailyCar.engageTurbo(); 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
OldCar.revEngine();
OldCar.engageTurbo();     

    }
    
}