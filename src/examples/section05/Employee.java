package examples.section05;

/**
 * @author Mohamed Elsayed
 */
public abstract class Employee 
{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee( String first, String last, String ssn )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }
    
    public void setFirstName( String first )
    {
        firstName = first;  // Should validate
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public void setLastName( String last )
    {
        lastName = last;    // Should validate
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn; // Should validate
    }
    
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s %s\n%s: %s", 
                getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber() );
    }
    
    public abstract double earnings();
}
