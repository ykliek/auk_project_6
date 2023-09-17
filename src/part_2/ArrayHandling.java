package part_2;

import java.util.Scanner;

public class ArrayHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of array: ");
		int length = scanner.nextInt();
		int[] inputArray = inputArray(length);

		// Sum of array elements
		int sum = 0;
		for (int value : inputArray) {
			sum += value;
		}
		System.out.println("Sum of array elements: " + sum);

		// Random array
		int[] randomArray = createRandomArray(length);
		System.out.println("Random array: ");
		printArray(randomArray);

		// Search largest value in an array
		int largestValue = randomArray[0];
		for (int value : randomArray) {
			if (value > largestValue) {
				largestValue = value;
			}
		}
		System.out.println("Largest value in an array: " + largestValue);

		// Search value in array
		System.out.println("Enter the value to search in array: ");
		int value = scanner.nextInt();
		int index = searchValueInArray(randomArray, value);
		if (index != -1) {
			System.out.println("Value " + value + " is in array at index " + index);
		} else {
			System.out.println("Value " + value + " is not in array");
		}
	}

	public static int[] inputArray(int length) {
		int[] array = new int[length];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < length; i++) {
			System.out.println("Enter the " + i + " element of array: ");
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public static int[] createRandomArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static int searchValueInArray(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
