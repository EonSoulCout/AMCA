package AMC;
import java.util.Scanner;

public class empleadoContrato extends empleado{

	Scanner scanner = new Scanner(System.in);
	
	public empleadoContrato(String name, String id, double paid) {
		super(name, id, paid);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculatePaid() {

        System.out.print("Ingrese el pago para el empleado " + getName() + ": ");
        double nuevoPago = scanner.nextDouble();
        setPaid(nuevoPago);
        return getPaid();
	}
	
}
