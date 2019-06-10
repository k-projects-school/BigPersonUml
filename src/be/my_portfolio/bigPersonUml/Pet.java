package be.my_portfolio.bigPersonUml;

public abstract class Pet {
	private double weight;
	private int age = 0;
	private String name;
	private int realAge = 0;
	
	private static final int AGE_MODIFIER = 0;

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the realAge
	 */
	public int getRealAge() {
		return realAge;
	}

	/**
	 * @param realAge the realAge to set
	 */
	public void setRealAge(int realAge) {
		this.realAge = realAge;
	}
	
	public abstract void beCute();
	
	public abstract void calculateRealAge();
}
