package examples.section05;

/**
 * @author Mohamed Elsayed
 */
public class HourlyEmployee extends Employee
{
    private double wage;    // wage per hour
    private double hours;   // hours worked for week
    
    public HourlyEmployee( String first, String last, String ssn, 
            double hourlyWage, double hoursWorked )
    {
        super( first, last, ssn );
        setWage( hourlyWage );      // Validate and store wage
        setHours( hoursWorked );    // Validate and store hours
    }
    
    public void setWage( double hourlyWage )
    {
        if ( hourlyWage >= 0.0 )
            wage = hourlyWage;
        else
            throw new IllegalArgumentException( "Hourly wage must be > = 0" );
    }
    
    public double getWage()
    {
        return wage;
    }
    
    public void setHours( double hoursWorked) 
    {
        if ( hoursWorked >= 0.0 && hoursWorked <= 168.0 )
            hours = hoursWorked;
        else
            throw new IllegalArgumentException( "Hours worked must be >= 0.0 and <= 168.0" );
    }
    
    public double getHours()
    {
        return hours;
    }

    @Override
    public double earnings() 
    {
        if ( getHours() <= 40 )
            return getWage() * getHours();
        else
            return ( 40 * getWage() ) + ( ( getHours() - 40 ) * getWage() * 1.5 );
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: $%,.2f\n%s: %.2f", 
                "hourly employee", super.toString(),
                "hourly wage", getWage(),
                "hours worked", getHours() );
    }
}