package be.my_portfolio.bigPersonUml;

import java.util.HashMap;

public class House {
	private Address address = new Address();
	private HashMap<String, Room> rooms = new HashMap<String, Room>();

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the rooms
	 */
	public HashMap<String, Room> getRooms() {
		return rooms;
	}

	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(HashMap<String, Room> rooms) {
		this.rooms = rooms;
	}
	
	public Room getRoom(String roomName) {
		return this.rooms.get(roomName);
	}
}
