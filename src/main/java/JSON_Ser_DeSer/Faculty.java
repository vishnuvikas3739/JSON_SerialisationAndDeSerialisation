package JSON_Ser_DeSer;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Faculty {

	String name;
	int number;
	String designation;
	String department;
	
	public Faculty(String name, int number, String designation, String department) {
		super();
		this.name = name;
		this.number = number;
		this.designation = designation;
		this.department = department;
	}
	public Faculty() {
		
	}
	@JsonProperty("Facutly_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty("Faculty_number")
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@JsonProperty("Faculty_designation")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@JsonProperty("Faculty_department")
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
class SerializeDemo{
	public static void main(String args[])
	{
		Faculty fe=new Faculty("vishnuvikas",30134,"Associate_Profissor","CSE");
		// Below is the Code for JSON Serialization.
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("vishnuvikas.json"), fe);
            System.out.println("Successfully Compiled");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Below is the Code for JSON Deserialization.
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Faculty fa = objectMapper.readValue(new File("vishnuvikas.json"), Faculty.class);
            System.out.println(fa.getName()+ " " + fa.getNumber()+" "+fa.getDesignation()+" "+ fa.getDepartment());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
