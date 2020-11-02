package model;

public class Beverage extends Food {

	private String size;
	private String type;
	
	public Beverage() {
		
	}
	
	//Setter Getter Alt + Shift + S, R

	public String getSize() {
		return size;
	}

	public boolean setSize(String size) {
		
		// case sensitive
		if(!size.equals("Small") && !size.equals("Medium") && !size.equals("Large")) {
			return false;
		}
		
		this.size = size;
		return true;
	}

	public String getType() {
		return type;
	}

	public boolean setType(String type) {
		
		// case insensitive
		if(!type.equalsIgnoreCase("Cold") && !type.equalsIgnoreCase("Hot")) {
			return false;
		}
		
		this.type = type;
		return true;
	}
	
	public int sizePrice() {
		int sizePrice = 0;
		
		if(this.size.equals("Small")) {
			sizePrice = 1 * 5000;
		}else if(this.size.equals("Medium")) {
			sizePrice = 2 * 5000;
		}else if(this.size.equals("Large")) {
			sizePrice = 3 * 5000;
		}
		
		return sizePrice;
	}
	
	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return (this.basePrice() + this.sizePrice() * this.getQty());
	}
	
//	@Override
//	public boolean setQty(int qty) {
//		// TODO Auto-generated method stub
//		if(qty < 2) {
//			return false;
//		}
//		super.setQty(qty);
//		return true;
//	}
	
}
	

