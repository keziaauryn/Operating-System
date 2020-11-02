package model;

public class Regular {

	private String category;
	private String name;
	private int page;
	
	public Regular() {
		// TODO Auto-generated constructor stub
	}

	public String getCategory() {
		return category;
	}

	public boolean setCategory(String category) {
		
		if(!category.equals("Comedy") && !category.equals("Romance") && !category.equals("Fiction")) {
			return false;
		}
		this.category = category;
		return true;
	}

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		
		if(name.length() < 5 || name.length() > 15) {
			return false;
		}
		this.name = name;
		return true;
	}

	public int getPage() {
		return page;
	}

	public boolean setPage(int page) {
		
		if(page < 50) {
			return false;
		}
		this.page = page;
		return true;
	}
	
	public int basePrice() {
		int basePrice = 0;
		
		if(this.category.equals("Comedy")) {
			basePrice = 55000;
		}else if(this.category.equals("Romance")) {
			basePrice = 58000;
		}else if(this.category.equals("Fiction")) {
			basePrice = 60000;
		}
		return basePrice;
	}
	
	public int additionalPrice() {
		int additionalPrice = 0;
		
		if(this.page >= 50 && this.page < 100) {
			additionalPrice = (this.basePrice() * 10)/100;
		}else if(this.page >= 100 && this.page < 150) {
			additionalPrice = (this.basePrice() * 20)/100;
		}else if(this.page >= 150) {
			additionalPrice = (this.basePrice() * 30)/100;
		}
		return additionalPrice;
	}
	
	public int totalPrice(){
		return this.basePrice() + this.additionalPrice();
	}

}
