package BuilderRestaurant;

public class Menu implements MenuPlan{

	private String MainDish;
	private String Desert;
	private String SoftDrinks;
	private String Gift;
	
	
	@Override
	public void setMainDish(String mainDish) {
		// TODO Auto-generated method stub
		this.MainDish=mainDish;
	}
	
	public String getMainDish() { return MainDish; }

	@Override
	public void setDesert(String desert) {
		// TODO Auto-generated method stub
		this.Desert=desert;
	}
	
	public String getDesert() { return Desert; }

	@Override
	public void setSoftDrinks(String softDrinks) {
		// TODO Auto-generated method stub
		this.SoftDrinks=softDrinks;
	}
	
	public String getSoftDrinks() { return SoftDrinks; }

	@Override
	public void setGift(String gift) {
		// TODO Auto-generated method stub
		this.Gift=gift;
	}
	
	public String getGift() { return Gift; }

}
