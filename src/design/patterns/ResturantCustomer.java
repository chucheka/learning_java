package design.patterns;

public class ResturantCustomer {

	public static void main(String[] args) {
		
		BaseRiceResturant riceResturant = new RiceResturant();
		
		// Order by customer that wants JellofRice
		Rice jellofRice = riceResturant.serveMyRiceDelicacy("JellofRice");

		Rice coconutRice = riceResturant.serveMyRiceDelicacy("CoconutRice");
	}

}
