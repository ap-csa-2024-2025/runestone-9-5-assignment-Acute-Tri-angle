// DiscountedItem inherits from Item
public class DiscountedItem extends Item
{
    // add an instance variable for the discount
    private double discount;

    // Add constructors that call the super constructor
    public DiscountedItem(){
        super();
        discount = 0.0;
    }

    public DiscountedItem(String name, double price, double discount){
        super(name, price);
        
        this.discount = discount;
    }
    // Add get/set methods for discount
    public double getDiscount()
    {
        return discount; // return discount here instead of 0
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    // Add a toString() method that returns a call to the super toString
    // and then the discount in parentheses using the super.valueToString() method
    public String toString(){
        return super.toString() + " -" + super.valueToString(this.getDiscount()); 
    }

}