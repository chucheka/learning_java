package design.patterns;

// THE CONCRETE PRODUCT
public class JellofRice extends Rice {

	@Override
	public void addIngredients() {
		
		System.out.println("Adding perfect ingredients to cook your "+JellofRice.class.getSimpleName());

	}

}
