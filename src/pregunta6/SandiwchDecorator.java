package pregunta6;

public abstract class SandiwchDecorator implements Sandwich {

	protected Sandwich sandwich;
	
	public SandiwchDecorator(Sandwich sandwich){
		this.sandwich = sandwich;
	}

	@Override
	public String make() {
		// TODO Auto-generated method stub
		return sandwich.make();
	}
	
}
