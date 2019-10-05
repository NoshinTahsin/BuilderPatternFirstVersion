package BuilderRestaurant;

public class MenuMain {

	public static void main(String[] args) {
		
		MenuDecider kidsMeal=new KidsMeal();
		
		MenuEngineer menuEngineer= new MenuEngineer(kidsMeal);
		
		menuEngineer.makeMenu();
		
		Menu kidsMenu=menuEngineer.getMenu();
		
		System.out.println("Menu Decided for Kids");
		System.out.println("");
		
		System.out.println("Main dish: "+kidsMenu.getMainDish());
		System.out.println("Desert: "+kidsMenu.getDesert());
		System.out.println("Soft Drinks: "+kidsMenu.getSoftDrinks());
		System.out.println("Gift: "+kidsMenu.getGift());
		
		
		
		System.out.println("");
		
		MenuDecider adultsMeal=new AdultsMeal();
		
		MenuEngineer menuEngineer2= new MenuEngineer(adultsMeal);
		
		menuEngineer2.makeMenu();
		
		Menu adultsMenu=menuEngineer2.getMenu();
		
		System.out.println("Menu Decided for Adults");
		System.out.println("");
		
		System.out.println("Main dish: "+adultsMenu.getMainDish());
		System.out.println("Desert: "+adultsMenu.getDesert());
		System.out.println("Soft Drinks: "+adultsMenu.getSoftDrinks());
		System.out.println("Gift: "+adultsMenu.getGift());
		
		
		

	}

}
