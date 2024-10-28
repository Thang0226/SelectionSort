public class SelectionSort {
	public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

	public static void selectionSort(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				double temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		selectionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
