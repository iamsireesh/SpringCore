package com.iamsireesh.setter.userdefined;

import java.util.Date;

public class UserDefinedImpl implements UserDefinedInterface {

	private int age;
	private UserDefined userdefinedmsg;
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setUserdefinedmsg(UserDefined userdefinedmsg) {
		this.userdefinedmsg = userdefinedmsg;
	}

	public void show() {
		System.out.println("Your Age is::" + age);
		System.out.println("Your Message::" + userdefinedmsg);
		System.out.println("Date is::" + date);

	}

}
