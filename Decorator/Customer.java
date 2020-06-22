package Deco;

public class Customer {
	 
    public static void main(String[] args) {
        
        Beverage beverage = new Americano();
        beverage = new Shot(beverage); //beverage �ʵ忡 Amerciano �ν��Ͻ� ����
        beverage = new Shot(beverage); //beverage �ʵ忡 Shot �ν��Ͻ� ����
        
        System.out.println("�޴� : " + beverage.getDescription());
        System.out.println("���� : " + beverage.cost());
        
        
    }
}