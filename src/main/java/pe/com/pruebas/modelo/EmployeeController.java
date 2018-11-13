package pe.com.pruebas.modelo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties
public class EmployeeController {
	private final EmployeeRepository repository;
	UtilEmployee util = new UtilEmployee();
	
	@Value("${file.ruta}")
	String ruta;
	
	public EmployeeController(EmployeeRepository respository) {
		super();
		this.repository = respository;
	}
	
	@GetMapping("/employees")
	List<Employee> all() {
		return repository.findAll();
	}

	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return repository.save(newEmployee);
	}
	
	@PostMapping("/employees2")
	String newEmployee2(@RequestBody Employee newEmployee) {
		try {
			repository.save(newEmployee);
			return util.responseJsonFile(ruta+newEmployee.getName()+".txt");
		} catch (IOException e) {
			e.printStackTrace();
			return newEmployee.getName();
	}

	
}
}