package examples.section05;

/**
 * @author Mohamed Elsayed
 */
public class SalariedEmployee extends Employee 
{
    private double weeklySalary;
    
    public SalariedEmployee( String first, String last, String ssn, double salary )
    {
        super( first, last, ssn );
        setWeeklySalary( salary );  // Validate and story weekly salary
    }
    
    public void setWeeklySalary( double salary )
    {
        if ( salary >= 0.0 )
            weeklySalary = salary;
        else
            throw new IllegalArgumentException( "Weekly salary must be >= 0.0" );
    }
    
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    @Override
    public double earnings() 
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: %s", 
                "salaried employee", super.toString(),
                "weekly salary", getWeeklySalary() );
    }
}
