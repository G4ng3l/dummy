package pe.com.pruebas.modelo;

public class EmployeeNotFoundException extends RuntimeException {
	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
