package pe.com.pruebas.modelo;


//import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue long id;
	private String name;
	private String role;
//	private UtilEmployee utilEmployee=new UtilEmployee();
	
	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}


//	@Override
//	public String toString() {
//		try {
//			return utilEmployee.responseJsonFile(this.role);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//		
//	}

	
}
