/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Kathleen Falcon
 *
 */
public class StudentImpl extends PersonBaseImpl implements Student {

	String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}
	
	@Override
	public String getDetails() {
		return "student";
	}

	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}

}
