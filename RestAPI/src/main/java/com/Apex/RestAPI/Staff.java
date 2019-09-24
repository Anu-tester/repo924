package com.Apex.RestAPI;

import java.math.BigDecimal;
import java.util.List;

public class Staff {
	
	
		
		 String name;
		 int age;
		 String position;
		 BigDecimal salary;
		 List<String> skills;
		 
		 public Staff(String name, int age,String position,BigDecimal salary,List<String> skills) {
				this.name=name;
				this.age=age;
				this.position=position;
				this.salary=salary;
				this.skills=skills;
			}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public BigDecimal getSalary() {
			return salary;
		}

		public void setSalary(BigDecimal salary) {
			this.salary = salary;
		}

		public List<String> getSkills() {
			return skills;
		}

		public void setSkills(List<String> skills) {
			this.skills = skills;
		}	 
		 
		 
	}
	
