import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P10814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Person> arr = new ArrayList<>();
		
		//n명 나이, 이름 입력받기
		for (int i=0; i<n; i++) {
			arr.add(new Person(sc.nextInt(), sc.next()));
		}
		
		Collections.sort(arr);
		
		for (Person p : arr) {
			System.out.println(p.age + " " + p.name);
		}
		sc.close();				
	}	
}

class Person implements Comparable<Person> {
	int age;
	String name;
	
	Person(int _age, String _name) {
		this.age = _age;
		this.name = _name;
	}
	
	@Override
	public int compareTo(Person o) {
		if (this.age < o.age) return -1;
		else if (this.age == o.age) return 0;
		else return 1;
	}
}