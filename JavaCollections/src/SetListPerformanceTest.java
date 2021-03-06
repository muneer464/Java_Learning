import java.util.*;

/**
 * (Performing set operations on hash sets) Create two hash sets 5 "George" ,
 * "Jim" , "John" , "Blake" , "Kevin" , "Michael" 6 and 5 "George" , "Katie" ,
 * "Kevin" , "Michelle" , "Ryan" 6 and find their union, difference, and
 * intersection. (You may clone the sets to preserve the original sets from
 * being changed by these set methods.)
 */
public class SetListPerformanceTest {
	public static void main(String[] args) {
		// Create a hash set, and test its performance
		System.out.println("Time for hash set is " + getTestTime(new HashSet<Integer>(), 500000) + " milliseconds");

		// Create a linked hash set, and test its performance
		System.out.println("Time for linked hash set is " + getTestTime(new LinkedHashSet<Integer>(), 500000) + " milliseconds");

		// Create a tree set, and test its performance
		System.out.println("Time for tree set is " + getTestTime(new TreeSet<Integer>(), 500000) + " milliseconds");

		// Create an array list, and test its performance
		System.out.println("Time for array list is " + getTestTime(new ArrayList<Integer>(), 60000) + " milliseconds");

		// Create a linked list, and test its performance
		System.out.println("Time for linked list is " + getTestTime(new LinkedList<Integer>(), 60000) + " milliseconds");
	}

	public static long getTestTime(Collection<Integer> c, int size) {
		long startTime = System.currentTimeMillis();

		// Add numbers 0, 1, 2, ..., size - 1 to the array list
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++)
			list.add(i);

		Collections.shuffle(list); // Shuffle the array list

		// Add the elements to the container
		for (int element : list)
			c.add(element);

		Collections.shuffle(list); // Shuffle the array list

		// Remove the element from the container
		for (int element : list)
			c.remove(element);

		long endTime = System.currentTimeMillis();
		return endTime - startTime; // Return the execution time
	}
}
