package Deco;

public abstract class Beverage {
    
    
    String description = "no title"; //음료 이름
 
    public abstract int cost();
 
    public String getDescription() {
        return description;
    }
    
}
