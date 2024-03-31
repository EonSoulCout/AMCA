package AMC;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ArrayList<empleado> listaEmpleados = new ArrayList<>();
		int op;

		do {
			System.out.println("1.- Agregar un empleador");
			System.out.println("2.- Mostrar empleados");
			System.out.println("3.- Calcular salario");
			System.out.println("0.- Cerrar sesion");
			System.out.println("Elija una opcion: ");

			op = scanner.nextInt();

			switch (op) {

			case 1:
				int tipoEmpleado;
				do {
					System.out.println("Seleccione el tipo de empleado:");
					System.out.println("1.- Empleado a tiempo completo");
					System.out.println("2.- Empleado a tiempo parcial");
					System.out.println("3.- Empleado con contrato");
					System.out.println("0.- Volver al menú principal");
					System.out.println("Elija una opción:");
					tipoEmpleado = scanner.nextInt();

					switch (tipoEmpleado) {
					case 1:
						agregarEmpleadoTiempoCompleto(listaEmpleados, scanner);
						break;
					case 2:
						agregarEmpleadoTiempoParcial(listaEmpleados, scanner);
						break;
					case 3:
						agregarEmpleadoContrato(listaEmpleados, scanner);
						break;
					case 0:
						break;
					default:
						System.out.println("Opción no válida. Inténtelo de nuevo.");
						break;
					}
				} while (tipoEmpleado != 0);

				break;

			case 2:
				for (empleado emp : listaEmpleados) {
					System.out.println(emp.show());
				}
				break;

			case 3:
				System.out.println("Ingrese el nombre del empleado para calcular su salario:");
				String nombreEmpleado = scanner.next();
				for (empleado emp : listaEmpleados) {
					if (emp.getName().equals(nombreEmpleado)) {
						System.out.println("El salario de " + emp.getName() + " es: " + emp.calculatePaid());
						break;
					}
				}
				break;
			case 0:
				System.out.println("Saliendo del programa");
				break;
			default:
				System.out.println("Error opcion mal ingresada");
				break;
			}


		} while (op != 0);
	}

	private static void agregarEmpleadoTiempoCompleto(ArrayList<empleado> listaEmpleados, Scanner scanner) {
	    System.out.println("Ingrese el nombre del empleado:");
	    String nombreTiempoCompleto = scanner.next();
	    String idTiempoCompleto = "Empleado a tiempo completo";
	    double salarioTiempoCompleto = 460.0;
	    empleadoTiempoCompleto nuevoEmpleadoTiempoCompleto = new empleadoTiempoCompleto(nombreTiempoCompleto, idTiempoCompleto, salarioTiempoCompleto);
	    listaEmpleados.add(nuevoEmpleadoTiempoCompleto);
	}

	private static void agregarEmpleadoTiempoParcial(ArrayList<empleado> listaEmpleados, Scanner scanner) {
	    System.out.println("Ingrese el nombre del empleado:");
	    String nombreTiempoParcial = scanner.next();
	    String idTiempoParcial = "Empleado a tiempo parcial";
	    empleadoTiempoParcial nuevoEmpleadoTiempoParcial = new empleadoTiempoParcial(nombreTiempoParcial, idTiempoParcial, 0);
	    listaEmpleados.add(nuevoEmpleadoTiempoParcial);
	}

	private static void agregarEmpleadoContrato(ArrayList<empleado> listaEmpleados, Scanner scanner) {
	    System.out.println("Ingrese el nombre del empleado:");
	    String nombreContrato = scanner.next();
	    String idContrato = "Empleado con contrato";
	    empleadoContrato nuevoEmpleadoContrato = new empleadoContrato(nombreContrato, idContrato, 0);
	    listaEmpleados.add(nuevoEmpleadoContrato);
	}
}

