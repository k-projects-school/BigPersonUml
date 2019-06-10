package be.my_portfolio.bigPersonUml;

import java.util.HashMap;

public abstract class Person {
	private static int count;
	
	private double weight;
	
	private int age;
	private HashMap<Integer, Pet> pets = new HashMap<Integer, Pet>();
	private HashMap<Integer, Hobby> hobbies = new HashMap<Integer, Hobby>();
	private House house;
	
	{
		count++;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

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
	 * @return the pets
	 */
	public HashMap<Integer, Pet> getPets() {
		return pets;
	}

	/**
	 * @param pets the pets to set
	 */
	public void setPets(HashMap<Integer, Pet> pets) {
		this.pets = pets;
	}

	/**
	 * @return the hobbies
	 */
	public HashMap<Integer, Hobby> showMyHobbies() {
		return hobbies;
	}

	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(HashMap<Integer, Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	/**
	 * @return the house
	 */
	public House getHouse() {
		return house;
	}

	/**
	 * @param house the house to set
	 */
	public void setHouse(House house) {
		this.house = house;
	}
}
