/* ************************************************************************** */
/*                                                                            */
/*                                                 :       ::    :: ::   ::   */
/*   ArraySyntax.java                             :+:      :+    :+ :+  :+    */
/*                                               +:+:+     :+    :+ :+  :+    */
/*   By: ykliek <yurii.kliek@auk.edu.ua>        +#   :+    +#    :+ +#:+      */
/*                                             +#+#+#+#+   +#    +# +# +#     */
/*   Created: 2023/09/18 21:37:04 by ykliek   #+       #+  #+    #+ #+  #+    */
/*   Updated: 2023/09/18 21:37:06 by ykliek  ##         ##  ######  ##   ##   */
/*                                                                            */
/* ************************************************************************** */

package part_1;

public class ArraySyntax {
	public static void main(String[] args) {
		// 1. Demonstrate array creation and initialization.

		// a. With predefined size
		int[] arr1 = new int[10];

		// b. With size defined by variable
		int size = 5;
		int[] arr2 = new int[size];

		// c. Literal array creation
		int[] intArr = { 1, 2, 3, 4, 5 };
		String[] strArr = { "Hello", "World" };
		char[] charArr = { 'a', 'b', 'c' };
		boolean[] boolArr = { true, false, true };

		// d. Array length
		System.out.println("Int array length: " + intArr.length);
		System.out.println("String array length: " + strArr.length);
		System.out.println("Char array length: " + charArr.length);
		System.out.println("Boolean array length: " + boolArr.length);

		// 2. Demonstrate array access.

		// a. Accessing array elements
		intArr[4] = 45;

		// b. Accessing array elements
		System.out.println("5th element value of intArray: " + intArr[4]);

		// c. Demonstrate error of accessing array element by non-existing index
		// Uncommenting the next line will throw an exception
		// System.out.println(intArr[1000]);

		// 3. Iterate over array

		// a. Using for loop
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

		// b. Using enhanced for loop
		for (int value : intArr) {
			System.out.println(value);
		}

		// c. Using while loop
		int i = 0;
		while (i < intArr.length) {
			System.out.println(intArr[i]);
			i++;
		}
	}
}
