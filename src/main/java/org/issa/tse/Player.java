package org.issa.tse;

public class Player {

	private String id;
    private String firstName;
    private String lastName;
    private int equipeId;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public int getEquipeId() {
		return equipeId;
	}

	public void setEquipeId(int equipeId) {
		this.equipeId = equipeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
