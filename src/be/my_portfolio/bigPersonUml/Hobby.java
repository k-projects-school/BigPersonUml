package be.my_portfolio.bigPersonUml;

public abstract class Hobby {
	private int timesPerWeek;
	private String name;
	private Address location;
	private static int count = 0;
	
	{
		count++;
	}

	/**
	 * @return the timesPerWeek
	 */
	public int getTimesPerWeek() {
		return timesPerWeek;
	}

	/**
	 * @param timesPerWeek the timesPerWeek to set
	 */
	public void setTimesPerWeek(int timesPerWeek) {
		this.timesPerWeek = timesPerWeek;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public Address getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Address location) {
		this.location = location;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public static void setCount(int count) {
		Hobby.count = count;
	}
}
