/**
 * 
 */
package com.mycompany.section3;

/**
 * @author Kathleen Falcon
 *
 */
public abstract class PersonBaseImpl implements Person {

	protected String name;

	public PersonBaseImpl(String _name) {
		name = _name;
	}
	
	@Override
	public String getName() {
		return name;
	}

}
