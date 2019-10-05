package BuilderRestaurant;

public class MenuEngineer {

	private MenuDecider menuDecider;
	
	public MenuEngineer(MenuDecider menuDecider)
	{
		this.menuDecider=menuDecider;
	}
	
	public Menu getMenu()
	{
		return this.menuDecider.getmenu();
	}
	
	public void makeMenu()
	{
		this.menuDecider.decideMainDish();
		this.menuDecider.decideDesert();
		this.menuDecider.decideSoftDrinks();
		this.menuDecider.decideGift();
		
	}
}

