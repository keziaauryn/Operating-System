package model;

public class Premium extends Regular{

	private String cover;
	
	public Premium() {
		// TODO Auto-generated constructor stub
	}

	public String getCover() {
		return cover;
	}

	public boolean setCover(String cover) {
		
		if(!cover.equals("Soft") && !cover.equals("Hard")) {
			return false;
		}
		this.cover = cover;
		return true;
	}
	
	public int variationPrice() {
		int variationPrice = 0;
		
		if(this.cover.equals("Soft")) {
			variationPrice = 15000;
		}else if(this.cover.equals("Hard")) {
			variationPrice = 10000;
		}
		return variationPrice;
	}
	
	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return this.basePrice() + this.additionalPrice() + this.variationPrice();
	}
	
}
