/*
* Project : DRE011 
* Date    : 6 Jan 2017
* Author  : Muthu Subramanian
*/

package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author SubramanianM
 *
 */
public class JavaFlatMap {
	public static void main(String args[]){
		List<Student> l = new ArrayList<Student>();
		l.add(new Student("ABC", "20"));
		l.add(new Student("DEF", "30"));
		
		System.out.println( l.stream().collect(Collectors.toMap(x -> ((Student) x).getName(), x -> ((Student) x).getAge())) ); 
	}
}



class Student {
	private String name;
	private String age;
	
	Student(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
