public class ComputeAnExpressionTwo
{
    public static void main(String args[])
    {
     //varible cluster
     double x = (9.5);
     double y = (4.5);
     double z = (2.5);
     double q = (45.5);
     double w = (3.5);
     //////////////////////////////////////////
     ReturningCalculator calc= new ReturningCalculator();
    double bam = calc.doubleMultiplier(x,y);
    double boom = calc.doubleSubtractor(q,w);
    double pow = calc.divider(z,q);
    System.out.println( bam - boom + pow );
    //comment update

    


    
    } 
}