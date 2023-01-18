package org.empresa.drones;

import org.empresa.drones.model.entity.Empleado;
import org.empresa.drones.model.repository.EmpleadoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.empresa.drones.SecurityConfig;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DronesApplicationTests {

	@Autowired
	private EmpleadoRepository empleadoRepository;

//	@Autowired
//	private BCryptPasswordEncoder encoder;

	@Test
	void crearUsuarioTEST() {
		Empleado empleado = new Empleado();
		empleado.setCargo("Gerente");
		empleado.setCelular("7777777");
		empleado.setCorreo("correo2@yahoo.com");
		empleado.setDireccion("Avenida 2");
		empleado.setDni("12345678");
		empleado.setEdad(25);
		empleado.setNombre("Susanita");
		empleado.setSexo("Femenino");
		empleado.setSueldo(6000.00);
//		empleado.setClave(encoder.encode("contraclave"));
		empleado.setClave("contraclave");

		Empleado empleadoRetorno = empleadoRepository.save(empleado);

		assertTrue(empleadoRetorno.getClave().equalsIgnoreCase(empleado.getClave()));
	}

}
