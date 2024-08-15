package Ejercicio1;

public class Principal {

	public static void main(String[] args) {

		Empleado empleado1 = new Empleado("Marcos Juarez", 32);
		Empleado empleado2 = new Empleado();
		Empleado empleado3 = new Empleado("Ariel Meza", 28);
		Empleado empleado4 = new Empleado();
		Empleado empleado5 = new Empleado("Sebastian Oro", 22);
		
		empleado2.setNombre("Oscar Leiva");
		empleado2.setEdad(39);
		
		empleado4.setNombre("Diego Aguero");
		empleado4.setEdad(26);
			
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		System.out.println(empleado3.toString());
		System.out.println(empleado4.toString());
		System.out.println(empleado5.toString());
		Empleado.devuelveProximoID();
	}
}