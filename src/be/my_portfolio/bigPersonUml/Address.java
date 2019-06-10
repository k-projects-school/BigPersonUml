package be.my_portfolio.bigPersonUml;

public class Address {
	private String street, city;
	private int houseNr, bus, zipCode;
	
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the houseNr
	 */
	public int getHouseNr() {
		return houseNr;
	}

	/**
	 * @param houseNr the houseNr to set
	 */
	public void setHouseNr(int houseNr) {
		this.houseNr = houseNr;
	}

	/**
	 * @return the bus
	 */
	public int getBus() {
		return bus;
	}

	/**
	 * @param bus the bus to set
	 */
	public void setBus(int bus) {
		this.bus = bus;
	}

	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		String string = "Address: \n~~~~~~~~\n"
				+ "Street 	  = " + street + " \n"
				+ "House nr. = " + houseNr;
		if (bus != 0) {
			string += " / " + bus;
		}
		
		string += "\n"
				+ "City 	  = " + city + ", \n"
				+ "Zip code  = " + zipCode;
		
		return string;
	}
}
