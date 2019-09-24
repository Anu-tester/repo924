package com.Apex.RestAPI;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class GsonExample {

	public static void main(String[] args) {

        Staff staff = createDummyObject();

        //1. Convert object to JSON string
        Gson gson = new Gson();
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("C:\\Users\\Anu\\Ecommercenew\\RestAPI\\src\\main\\java\\com\\Apex\\RestAPI\\Staff.json")) {

            gson.toJson(staff, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Staff createDummyObject() {

        Staff staff = new Staff(null, 0, null, null, null);

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }

}

