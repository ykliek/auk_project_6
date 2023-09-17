package part_3;

public class Contact {
	// Init contact fields
	private String name;
	private String phone;

	// Init contact constructor
	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// Init contact getters
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	// Init contact setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
