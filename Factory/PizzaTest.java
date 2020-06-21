public class PizzaTest {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("민수가 주문한 피자는? " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("철수가 주문한 피자는? " + pizza.getName());
	}	
}


/*-------------- 피자스토어 추상 클래스 ---------------*/
public abstract class PizzaStore {	
	public Pizza orderPizza(String name) {
		Pizza pizza;
		pizza = createPizza(name);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String name);
}


/*-------------- 피자 추상 클래스 ---------------*/
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	
	void prepare() {
		System.out.println("피자 준비중~");
	}
	
	void bake() {
		System.out.println("피자 굽는중~");
	}
	
	void cut() {
		System.out.println("피자 자르는 중~");
	}
	
	void box() {
		System.out.println("피자 포장중~");
	}
	
	public String getName() {
		return name;
	}
}



/*-------------- 구체화시킨 피자 스토어 클래스 ---------------*/
public class NYPizzaStore extends PizzaStore {
	Pizza createPizza(String name) {
		if(name.equals("cheese"))
			return new NYCheesePizza();
		else if(name.equals("greek"))
			return new NYGreekPizza();
		else if(name.equals("pepperoni"))
			return new NYPepperoniPizza();
		else
			return null;
	}
}



public class ChicagoPizzaStore extends PizzaStore {
	Pizza createPizza(String name) {
		if(name.equals("cheese"))
			return new ChicagoCheesePizza();
		else if(name.equals("greek"))
			return new ChicagoGreekPizza();
		else if(name.equals("pepperoni"))
			return new ChicagoPepperoniPizza();
		else
			return null;
	}
}




/*-------------- 구체화시킨 피자  클래스들 ---------------*/
public class NYCheesePizza extends Pizza{
	public NYCheesePizza() {
		name = "뉴욕 스타일 치즈 피자";
		dough = "얄은 도우";
		sauce = "마리나라 소스";
	}
}



public class NYGreekPizza extends Pizza{
	public NYGreekPizza() {
		name = "뉴욕 스타일 greek 피자";
		dough = "얄은 도우";
		sauce = "마리나라 소스";
	}
}



public class NYPepperoniPizza extends Pizza{
	public NYPepperoniPizza() {
		name = "뉴욕 스타일 페퍼로니 피자";
		dough = "얄은 도우";
		sauce = "마리나라 소스";
	}
}



public class ChicagoCheesePizza extends Pizza{
	public ChicagoCheesePizza() {
		name = "시카고 스타일 치즈 피자";
		dough = "두꺼운 도우";
		sauce = "매운 소스";
	}
}




public class ChicagoGreekPizza extends Pizza{
	public ChicagoGreekPizza() {
		name = "시카고 스타일 Greek피자";
		dough = "두꺼운 도우";
		sauce = "매운 소스";
	}
}



public class ChicagoPepperoniPizza extends Pizza{
	public ChicagoPepperoniPizza() {
		name = "시카고 스타일 페퍼로니 피자";
		dough = "두꺼운 도우";
		sauce = "매운 소스";
	}
}
