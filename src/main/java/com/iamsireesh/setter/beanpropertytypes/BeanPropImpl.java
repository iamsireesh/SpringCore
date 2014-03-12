package com.iamsireesh.setter.beanpropertytypes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BeanPropImpl implements BeanPropInterface {
	// primitive types
	private int luckyno;
	private float salary;
	private double age;
	// Object
	private String aboutyou;
	private List fruits;
	private Set vegetables;
	private String course[];
	private int runs[];

	// User Defined
	private UserDefinedBean userdefined;

	public void setUserdefined(UserDefinedBean userdefined) {
		this.userdefined = userdefined;
	}

	public void setLuckyno(int luckyno) {
		this.luckyno = luckyno;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void setAboutyou(String aboutyou) {
		this.aboutyou = aboutyou;
	}

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setVegetables(Set vegetables) {
		this.vegetables = vegetables;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public void setRuns(int[] runs) {
		this.runs = runs;
	}

	public String showProperties() {
		return userdefined + ",\n" + "luckyno=" + luckyno + ",\n" + " salary="
				+ salary + ",\n" + "age=" + age + ",\n" + "aboutyou="
				+ aboutyou + ",\n" + "fruits=" + fruits + ",\n" + "vegetables="
				+ vegetables + ",\n" + " course=" + Arrays.toString(course)
				+ ",\n" + "runs=" + Arrays.toString(runs);
	}

}
