/**
 * 
 */
package JUnit.Junit09_Geometria.dto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author paul_
 *
 */

class GeometriaTest {
	Geometria geometria = new Geometria();

	
	@Test //Comprobamos el método para calcular el area del cuadrado
	void testAreaCuadrado() {
		System.out.println("Area cuadrado");
		assertEquals(4, geometria.areacuadrado(2));
	}

	
	@Test //Comprobamos el método para calcular el area del circulo
	void testAreaCirculo() {
		System.out.println("Area circulo");
		assertEquals(12.5, geometria.areaCirculo(2), 0.1);
	}

	
	@Test //Comprobamos el método para calcular el area del triangulo
	void testAreaTriangulo() {
		System.out.println("Area triangulo");
		assertEquals(5, geometria.areatriangulo(2, 5));
	}

	
	@Test //Comprobamos el método para calcular el area del rectangulo
	void testAreaRectangulo() {
		System.out.println("Area rectangulo");
		assertEquals(10, geometria.arearectangulo(2, 5));
	}

	
	@Test //Comprobamos el método para calcular el area del pentagono
	void testAreaPentagono() {
		System.out.println("Area pentagono");
		assertEquals(10, geometria.areapentagono(5, 4));
	}

	
	@Test //Comprobamos el método para calcular el area del rombo
	void testAreaRombo() {
		System.out.println("Area rombo");
		assertEquals(4, geometria.arearombo(4, 2));
	}

	
	@Test //Comprobamos el método para calcular el area del romboiode
	void testAreaRomboide() {
		System.out.println("Area romboiode");
		assertEquals(10, geometria.arearomboide(2, 5));
	}
	
	@Test //Comprobamos el método para calcular el area del trapecio
	void testAreaTrapecio() {
		System.out.println("Area trapecio");
		assertEquals(16, geometria.areatrapecio(3, 5, 4));
	}
	
	@Test //Asignamos un area y comprobamos que se asigna correctamente
	void testGetArea() {
		geometria.setArea(4.25);
		assertEquals(4.25, geometria.getArea());
	}

	@Test //Comprobamos que el valor de la id se actualiza correctamente
	void testSetId() {
		geometria.setId(3);
		assertEquals(3, geometria.getId());
	}
	
	@Test //Comprobamos que id por defecto es correcta
	void testGetId() {
		assertEquals(9, geometria.getId());
	}
	
	@Test //Comprobamos en el switch que las figuras coinciden con la id
	void testSwitch() {
		assertEquals("cuadrado", geometria.figura(1));
		assertEquals("Circulo", geometria.figura(2));
		assertEquals("Triangulo", geometria.figura(3));
		assertEquals("Rectangulo", geometria.figura(4));
		assertEquals("Pentagono", geometria.figura(5));
		assertEquals("Rombo", geometria.figura(6));
		assertEquals("Romboide", geometria.figura(7));
		assertEquals("Trapecio", geometria.figura(8));
		assertEquals("Default", geometria.figura(9));
	}
	
	@Test //Creamos un objeto Geometria con una id y comprobamos que la figura es correcta
	void testGetNom() {
		geometria = new Geometria(6);
		assertEquals("Rombo", geometria.getNom());
	}

	@Test //Asignamos un nombre al objeto a Triangulo y comprobamos que se actualiza correctamente
	void testSetNom() {
		geometria.setNom("triangulo");
		assertEquals("triangulo", geometria.getNom());
	}
	
	@Test //Comprobamos el método toString
	void testToString() {
		geometria = new Geometria(1);
		geometria.setArea(geometria.areacuadrado(2));
		assertEquals("Geometria [id=1, nom=cuadrado, area=4.0]", geometria.toString());
	}
}
