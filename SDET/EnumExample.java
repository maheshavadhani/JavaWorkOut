package Java8Features;

import java.util.EnumSet;

public class EnumExample {

	public enum season {WINTER,SUMMER,AUTUMN,FALL}
	
	public static void main(String[] args) {
	
		
		for (season s : season.values()) {
			System.out.println(s);
		}
		System.out.println("Value of Winter is:"+ season.valueOf("WINTER"));
		System.out.println("Winter index is:"+ season.valueOf("WINTER").ordinal());
		
		Ecart e = new Ecart();
		
	}

}

class Ecart {
	
	enum Categories {MOBILES,GROCCERIES,ESSENTIALS,CLOTHES,SHOES}
	
	String userShoppingCart = "MOBILES";
	Categories shoppingcart = Categories.valueOf(userShoppingCart);
	 
	EnumSet<Categories> discountedCarts = EnumSet.of( 
			Categories.SHOES,Categories.MOBILES);
	{
	 
	if(discountedCarts.contains(shoppingcart)) {
		System.out.println("APPLY DISCOUNT RULES ACCORINGLY");
	}else {
		System.out.println("NO DISCOUNT...");
	}
	}
}


