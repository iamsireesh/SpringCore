package com.iamsireesh.ap.multiconfigread;

public class SecondBean {
private String gender, profession;

public void setGender(String gender) {
	this.gender = gender;
}

public void setProfession(String profession) {
	this.profession = profession;
}

@Override
public String toString() {
	return "SecondBean [gender=" + gender + ", profession=" + profession + "]";
}


}
