package pe.com.pruebas.modelo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

@Component
public class UtilEmployee {

	public String responseJsonFile(String archivo) throws IOException {
		File file = new File(archivo);
		String data = FileUtils.readFileToString(file, "UTF-8");
		return data;
	}

}
