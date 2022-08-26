package ec.edu.itsqmet.init.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InitSpringApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(3, ivaCalculator());
		assertEquals(300, calcularArea(10, 30));
		System.out.println("test");
	}
	
	public int ivaCalculator() {
		var iva = 3;
		return iva;
	}
	public int calcularArea(int base, int altura) {
		return base * altura;
	}

}
