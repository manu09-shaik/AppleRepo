public class TestMain {

	/**
 * 	 * @param args
 * 	 	 */
	public static void main(String[] args) {
		SaleData data = new SaleData();
		displaySaleMessage();
		data.displaySaleData();
	}

	public static void displaySaleMessage(){
		System.out.println(" *** Hello Happy Sales from displaySaleMessage method *** ");
		System.out.println(" *** Method from displaySaleMessage Sale Data *** ");
	}
}
