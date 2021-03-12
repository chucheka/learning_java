package design.patterns;

//THE CONCRETE PRODUCT
public class CoconutRice extends Rice {

	@Override
	public void addIngredients() {
		
		System.out.println("Adding perfect ingredients to cook your "+CoconutRice.class.getSimpleName());

	}

}
