public class MaxMinFinder<T extends Comparable<T>> {
    public T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T findMin(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MaxMinFinder<Integer> intFinder = new MaxMinFinder<>();
        Integer[] intArray = {4, 2, 7, 1, 3};
        System.out.println("Max int: " + intFinder.findMax(intArray));
        System.out.println("Min int: " + intFinder.findMin(intArray));

        MaxMinFinder<Double> doubleFinder = new MaxMinFinder<>();
        Double[] doubleArray = {3.4, 1.2, 4.5, 2.1, 5.6};
        System.out.println("Max double: " + doubleFinder.findMax(doubleArray));
        System.out.println("Min double: " + doubleFinder.findMin(doubleArray));

        MaxMinFinder<String> stringFinder = new MaxMinFinder<>();
        String[] stringArray = {"hello", "world", "abc", "xyz", "def"};
        System.out.println("Max string: " + stringFinder.findMax(stringArray));
        System.out.println("Min string: " + stringFinder.findMin(stringArray));
    }
}