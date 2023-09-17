package part_3;


import java.util.Scanner;

public class ContactsDatabase {
	// Init max contacts constant
	private static final int MAX_CONTACTS = 100;
	// Init contacts array
	private static Contact[] contacts = new Contact[MAX_CONTACTS];
	// Init contacts count
	private static int contactsCount = 0;
	// Init scanner
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			showMenu();

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					addContact();
					break;
				case 2:
					showContacts(null);
					break;
				case 3:
					searchContacts();
					break;
				case 4:
					editContact();
					break;
				case 5:
					deleteContact();
					break;
				case 6:
					deleteAllContacts();
					break;
				case 7:
					addSampleContacts();
					break;
				case 0:
					System.out.println("Bye!");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}

	public static void showMenu() {
		System.out.println("\n>>>  Contacts Menu  <<<");
		System.out.println("1. Add Contacts");
		System.out.println("2. Show Contacts");
		System.out.println("3. Search Contacts");
		System.out.println("4. Edit Contact");
		System.out.println("5. Delete Contact");
		System.out.println("6. Delete All Contacts");
		System.out.println("7. Add Sample Contacts");
		System.out.println("0. Exit");
	}

	public static void addContact() {
		System.out.println("Add your contacts");
		while (true) {
			if (contactsCount < MAX_CONTACTS) {
				System.out.println("Enter the name of contact: ");
				String name = scanner.nextLine();

				System.out.println("Enter the phone number of contact: ");
				String phoneNumber = scanner.nextLine();

				Contact contact = new Contact(name, phoneNumber);
				contacts[contactsCount] = contact;
				contactsCount++;
				System.out.println("Add another contact? (Y/N)");
				String choice = scanner.nextLine();
				if (choice.equals("N")) {
					break;
				}
			} else {
				System.out.println("Contacts limit reached!");
				break;
			}
		}
	}

	/**
	 * This method shows all contacts.
	 *
	 * @param indexes - the array of indexes to be shown.
	 *                if null, all contacts will be shown.
	 */
	public static void showContacts(int[] indexes) {
		if (indexes == null) {
			for (int i = 0; i < contactsCount; i++) {
				System.out.println("Contact #" + (i + 1) + "\n");
				System.out.println(
						"Contact name: " + contacts[i].getName());
				System.out.println(
						"Contact phone: " + contacts[i].getPhone() + "\n");
			}
		} else {
			if (indexes.length > 0) {
				for (int index : indexes) {
					System.out.println("Contact #" + (index + 1) + "\n");
					System.out.println(
							"Contact name: " + contacts[index].getName());
					System.out.println(
							"Contact phone: " + contacts[index].getPhone() + "\n");
				}
			} else {
				System.out.println("No contacts found!");
			}
		}
	}

	/**
	 * Make search within contacts and prints with showContacts method.
	 */
	public static int searchContacts() {
		System.out.println("Enter the search string: ");
		String search = scanner.nextLine();

		// Init indexes array
		int[] indexes = new int[contactsCount];
		int count = 0;
		for (int i = 0; i < contactsCount; i++) {
			if (contacts[i].getName().contains(search) ||
					contacts[i].getPhone().contains(search)) {
				indexes[count] = i;
				count++;
			}
		}
		// Create new array with size of count
		int[] result = new int[count];
		// Copy elements from indexes array to result array
		System.arraycopy(indexes, 0, result, 0, count);
		showContacts(result);
		return count;
	}

	/**
	 * This method asks user to enter the contact index to be edited
	 * and edits it.
	 */
	public static void editContact() {
		System.out.println("Enter the contact index to be edited: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		if (index > 0 && index <= contactsCount) {
			System.out.println("Enter the new name of contact: ");
			String name = scanner.nextLine();
			System.out.println("Enter the new phone number of contact: ");
			String phone = scanner.nextLine();
			contacts[index - 1].setName(name);
			contacts[index - 1].setPhone(phone);
			System.out.println("Contact edited successfully!");
		} else {
			System.out.println("Invalid contact index!");
		}
	}

	/**
	 * This method asks user to enter the contact index to be deleted
	 * and deletes it.
	 */
	public static void deleteContact() {
		System.out.println("Enter the contact index to be deleted: ");
		int index = scanner.nextInt();
		scanner.nextLine();
		if (index > 0 && index <= contactsCount) {
			for (int i = index - 1; i < contactsCount - 1; i++) {
				contacts[i] = contacts[i + 1];
			}
			contactsCount--;
			System.out.println("Contact deleted successfully!");
		} else {
			System.out.println("Invalid contact index!");
		}
	}

	/**
	 * This method deletes all contacts.
	 */
	public static void deleteAllContacts() {
		System.out.println("Are you sure you want to delete all contacts? (Y/N)");
		String choice = scanner.nextLine();
		if (choice.equals("Y")) {
			contacts = new Contact[MAX_CONTACTS];
			contactsCount = 0;
			System.out.println("All contacts deleted successfully!");
		}
	}

	/**
	 * This method adds sample contacts.
	 */
	public static void addSampleContacts() {
		Contact contact1 = new Contact("John Doe", "1234567890");
		Contact contact2 = new Contact("Jane Doe", "0987654321");
		contacts[0] = contact1;
		contacts[1] = contact2;
		contactsCount = 2;
		System.out.println("Sample contacts added successfully!");
	}
}
