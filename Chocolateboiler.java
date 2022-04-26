public class Chocolateboiler {
	private boolean empty;
	private boolean boiled;
	private static Chocolateboiler uniqueInstance;
	
	private Chocolateboiler() { 
		empty = true;
		boiled = false;
	}
	
	 public static Chocolateboiler getInstance() {
		 if(uniqueInstance == null) {
			 uniqueInstance = new Chocolateboiler();
		 }
		 return uniqueInstance;
		}
}
