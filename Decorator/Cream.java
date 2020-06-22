package Deco;

public class Cream extends CondimentDecorator {
	 
    Beverage beverage;
    
        
    public Cream(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
 
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", Å©¸²";
    }
 
    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return beverage.cost() + 500;
    }
    
    
 
}