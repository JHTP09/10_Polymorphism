package examples.section07;

/**
 * @author Mohamed
 */
public class Invoice implements Payable 
{
    private String partNumber;
    private String partDesc;
    private int quantity;
    private double pricePerItem;
    
    public Invoice( String partNumber, String partDesc, int quantity, double pricePerItem )
    {
        this.partNumber = partNumber;
        this.partDesc = partDesc;
        setQuantity( quantity );            // validate and store quantity
        setPricePerItem( pricePerItem );    // validate and story price per item
    }
    
    public void setPartNumber( String number )
    {
        partNumber = number;    // should validate
    }
    
    public String getPartNumber()
    {
        return partNumber;
    }
    
    public void setPartDesc( String desc )
    {
        partDesc = desc;    // should validate
    }
    
    public String getPartDesc()
    {
        return partDesc;
    }
    
    public void setQuantity( int count )
    {
        if ( count >= 0 )
            quantity = count;
        else
            throw new IllegalArgumentException( "Quantity must be >= 0" );
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setPricePerItem( double price )
    {
        if ( price >= 0 )
            pricePerItem = price;
        else
            throw new IllegalArgumentException( "Price per item must be >= 0" );
    }
    
    public double getPricePerItem()
    {
        return pricePerItem;
    }

    @Override
    public double getPaymentAmount() 
    {
        return getQuantity() * getPricePerItem();
    }
    
    @Override
    public String toString()
    {
        return String.format( "%s:\n%s: %s (%s)\n%s: %d\n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDesc(),
                "quantity", getQuantity(), "price per item", getPricePerItem() );
    }
}
