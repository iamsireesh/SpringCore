package com.iamsireesh.ci.beanpropertytypes;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.iamsireesh.setter.beanpropertytypes.UserDefinedBean;

public class CIBeanProperties {
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
		
		
		
		
		public CIBeanProperties(int luckyno, float salary, double age,
				String aboutyou, List fruits, Set vegetables, String[] course,
				int[] runs, UserDefinedBean userdefined) {
			super();
			this.luckyno = luckyno;
			this.salary = salary;
			this.age = age;
			this.aboutyou = aboutyou;
			this.fruits = fruits;
			this.vegetables = vegetables;
			this.course = course;
			this.runs = runs;
			this.userdefined = userdefined;
		}




		public String showProperties() {
			return userdefined + ",\n" + "luckyno=" + luckyno + ",\n" + " salary="
					+ salary + ",\n" + "age=" + age + ",\n" + "aboutyou="
					+ aboutyou + ",\n" + "fruits=" + fruits + ",\n" + "vegetables="
					+ vegetables + ",\n" + " course=" + Arrays.toString(course)
					+ ",\n" + "runs=" + Arrays.toString(runs);
		}
}
