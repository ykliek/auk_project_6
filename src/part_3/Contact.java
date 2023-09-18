/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   Contact.java                                 :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/18 21:37:27 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/18 21:37:30 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

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
