package design.patterns;

public class RiceResturant extends BaseRiceResturant{
    @Override
    public Rice serveMyRiceDelicacy(String delicacy){
    	
        Rice rice;
        
        switch (delicacy.toLowerCase())
        {
            case "jellofrice":
                rice = new JellofRice();
                break;
            case "friedrice":
                rice = new FriedRice();
                break;
            case "coconutrice":
            	rice = new CoconutRice();
                break;
            default: throw new IllegalArgumentException("No such rice delicacy");
        }
        rice.addIngredients();
        rice.cookRice();
      return  rice;
    }
}