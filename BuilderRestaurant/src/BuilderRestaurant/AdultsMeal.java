package BuilderRestaurant;

public class AdultsMeal implements MenuDecider{
	
	private Menu menu;
	
	public AdultsMeal() {
		
		this.menu=new Menu();
	}
	
	@Override
	public void decideMainDish() {
		// TODO Auto-generated method stub
		menu.setMainDish("Pizza");
	}

	@Override
	public void decideDesert() {
		// TODO Auto-generated method stub
		menu.setDesert("Cheesecake");
	}

	@Override
	public void decideSoftDrinks() {
		// TODO Auto-generated method stub
		menu.setSoftDrinks("Fanta");
	}

	@Override
	public void decideGift() {
		// TODO Auto-generated method stub
		menu.setGift("KeyRing");
	}
	

	@Override
	public Menu getmenu() {
		return this.menu;
	}


}
