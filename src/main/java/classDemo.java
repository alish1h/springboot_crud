import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class classDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
		List<Integer> l=Arrays.asList(2,3,6,6,5,4,322,2,45,6,64,3,6);
		List<Integer> asc=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(asc);
	}

}
