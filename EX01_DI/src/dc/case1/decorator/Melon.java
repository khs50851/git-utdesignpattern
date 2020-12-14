package dc.case1.decorator;

import dc.case1.base.IceCream;

public class Melon extends Decorator{
IceCream icecream;
	
	public Melon(IceCream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public String getDiscription() {
		return icecream.getDescription()+" 멜론";
	}
	
	@Override
	public int price() {
		return 300+icecream.price();
	}
}
