package BuilderRestaurant;

public class KidsMeal implements MenuDecider {

	private Menu menu;
	
	public KidsMeal() {
		
		this.menu=new Menu();
	}
	
	@Override
	public void decideMainDish() {
		// TODO Auto-generated method stub
		menu.setMainDish("Burger");
	}

	@Override
	public void decideDesert() {
		// TODO Auto-generated method stub
		menu.setDesert("Doughnut");
	}

	@Override
	public void decideSoftDrinks() {
		// TODO Auto-generated method stub
		menu.setSoftDrinks("Pepsi");
	}

	@Override
	public void decideGift() {
		// TODO Auto-generated method stub
		menu.setGift("Car");
	}
	

	@Override
	public Menu getmenu() {
		return this.menu;
	}

}
