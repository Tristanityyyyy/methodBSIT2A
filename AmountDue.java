package package1;

class AmountDue {
	public void computeAmountDue(double price) {
		double priceTax =  price / 100 * 12;
		double itemPrice = price + priceTax;
		System.out.println("Amount due is " + itemPrice);
	}
	
	public void computeAmountDue(double price, double quantity) {
		double multipliedPrice = price * quantity;
		double itemPrice = multipliedPrice / 100 * 12;
		double priceTax = multipliedPrice + itemPrice;
		
		System.out.println("Amount due is " + priceTax);
	}
	
	public void computeAmountDue(double price, double quantity, double discount) {
		double multipliedPrice = price * quantity;
		double discountPrice = multipliedPrice - discount;
		double priceTax = discountPrice  / 100 * 12;
		double totalPrice = discountPrice + priceTax;
		
		System.out.println("Amount due is " + totalPrice);
	}
	
	
}
