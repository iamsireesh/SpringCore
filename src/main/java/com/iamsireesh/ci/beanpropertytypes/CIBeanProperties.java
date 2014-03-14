package com.iamsireesh.ci.beanpropertytypes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
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
		private Map sports;
		private Properties politicians;

		// User Defined
		private UserDefinedBean userdefined;
		
		
		
		
		
		public CIBeanProperties(int luckyno, float salary, double age,
				String aboutyou, List fruits, Set vegetables, String[] course,
				int[] runs,Map sports,Properties politicians, UserDefinedBean userdefined) {
			super();
			this.luckyno = luckyno;
			this.salary = salary;
			this.age = age;
			this.aboutyou = aboutyou;
			this.fruits = fruits;
			this.vegetables = vegetables;
			this.course = course;
			this.runs = runs;
			this.sports=sports;
			this.politicians=politicians;
			this.userdefined = userdefined;
		}




		public String showProperties() {
			return userdefined + ",\n" + "luckyno=" + luckyno + ",\n" + " salary="
					+ salary + ",\n" + "age=" + age + ",\n" + "aboutyou="
					+ aboutyou + ",\n" + "fruits=" + fruits + ",\n" + "vegetables="
					+ vegetables + ",\n" + " course=" + Arrays.toString(course)
					+ ",\n" + "runs=" + Arrays.toString(runs)
					+",\n"+"sports="+sports
					+",\n"+"politicians="+politicians;
		}
}
