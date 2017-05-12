
public class FlashLight implements Items {
	private boolean used = false;
	public void use() {
	System.out.println("The lights start to flicker. You give a gentle tap and it still flickers. You swing the flashlight on you palm\n"
			+ "very hard on the inside of your palm and suddenly it starts working.");
	used = true;
	}
	public String description() {	
	return "Battery powered object that can be used to illuminate your surroundings. Be careful with the battery level. Use cautiously.";
}

	public String getName() {
		return "flashlight ";
	}
	public void pickup() {
		System.out.println("You picked up "+
				this.getName());
		
	}
	
	public void drop() {
		System.out.println("You just dropped a. " + this.getName() + "Be careful with what you drop.");
		
	}
	
	public boolean used(){
		return used;
	}
}
