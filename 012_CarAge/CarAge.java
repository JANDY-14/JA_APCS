public class CarAge
{
    public static void main(String args[])
    {
// car class cluster and variable
double CurYear=(2019);
    Car sportsCar = new Car(1987,10_000,"Ferrari","F40",false); 
    Car HyperCar = new Car(2019,10,"Aston martin","valkrie",true);
    Car DailyCar = new Car(2016,100_000,"subaru","wrx sti",true);
    Car FastCar = new Car(2109,1_500,"Buggati","chiron SS 300",false);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println(CurYear - sportsCar.year);
     }
    
}