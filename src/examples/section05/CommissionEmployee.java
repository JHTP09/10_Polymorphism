package examples.section05;

/**
 * @author Mohamed Elsayed
 */
public class CommissionEmployee extends Employee 
{
    private double grossSales;      // gross weekly sales
    private double commissionRate;  // commission percentage

    public CommissionEmployee( String first, String last, String ssn,
            double sales, double rate )
    {
        super( first, last, ssn );
        setGrossSales( sales );     // Validate and store grossSales
        setCommissionRate( rate );  // Validate and store commissionRate
    }
    
    public void setGrossSales( double sales )
    {
        if ( sales >= 0 )
            grossSales = sales;
        else
            throw new IllegalArgumentException( "Gross sales must be >= 0" );
    }
    
    public double getGrossSales()
    {
        return grossSales;
    }
    
    public void setCommissionRate( double rate )
    {
        if ( rate > 0.0 && rate < 1.0 )
            commissionRate = rate;
        else
            throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0" );
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    @Override
    public double earnings() 
    {
        return getGrossSales() * getCommissionRate();
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: $%,.2f\n%s: %.2f", 
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
    
}
