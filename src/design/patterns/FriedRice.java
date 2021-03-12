package design.patterns;

//THE CONCRETE PRODUCT
public class FriedRice extends Rice {

	@Override
	public void addIngredients() {
		
		System.out.println("Adding perfect ingredients to cook your "+FriedRice.class.getSimpleName());

	}
}

