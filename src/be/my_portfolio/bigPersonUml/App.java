package be.my_portfolio.bigPersonUml;

public class App {

	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("E�n Meistraat");
		address.setBus(2);
		address.setHouseNr(29);
		address.setCity("Turnhout");
		address.setZipCode(2300);
		System.out.println(address);
	}

}
