package com.nisum.webflux.model;

import org.springframework.data.annotation.Id;


//@Data
//
////@ToString(exclude= {"id","dob"})
//@NoArgsConstructor
//@AllArgsConstructor
//@Document
public class Hobby {
	@Id
	private String hobbyId;
	private String hobbyName;
	@Override
	public String toString() {
		return "Hobby [hobbyId=" + hobbyId + ", hobbyName=" + hobbyName + "]";
	}
	public Hobby(String hobbyId, String hobbyName) {
		super();
		this.hobbyId = hobbyId;
		this.hobbyName = hobbyName;
	}
	public Hobby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	public String getHobbyName() {
		return hobbyName;
	}
	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}
	

}
