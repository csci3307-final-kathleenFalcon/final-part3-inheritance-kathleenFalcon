/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Kathleen Falcon
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1, p2;
		Teacher t = new TeacherImpl("ilker", "java");
		Student s = new StudentImpl("kathleen", "java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("Person 1: " + p1.getName());
		System.out.println("Person 2: " + p2.getName());
		
		System.out.println("Person 1: " + p1.getDetails());
		System.out.println("Person 2: " + p2.getDetails());

	}

}
