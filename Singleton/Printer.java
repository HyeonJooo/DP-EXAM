 public class Printer {
    	private static Printer printer = null;
    
    	private Printer(){}//생성자를 private
    
    	public static Printer getInstance() {
    		if(printer == null) {
    			printer = new Printer();
    		}
    		return printer;
    	}
    
    	public void print(String input) {
    		System.out.println(input);
    	}
    }
