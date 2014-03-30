package com.iamsireesh.innerbeans;

public class Second {
private First first;
private String gender;
public void setFirst(First first) {
	this.first = first;
}
public void setGender(String gender) {
	this.gender = gender;
}

@Override
public String toString() {
	return "Second [first=" + first + ", gender=" + gender + "]";
}

}
