package AMC;
import java.util.Scanner;
public class empleadoTiempoParcial extends empleado{

	Scanner scanner = new Scanner(System.in);
	
	private int hour;
	public empleadoTiempoParcial(String name, String id, double paid) {
		super(name, id, paid);
		// TODO Auto-generated constructor stub
	}

	public int getHours() {
		return hour;
	}

	public void setHours(int hour) {
		this.hour = hour;
	}

	@Override
	public double calculatePaid() {
		// TODO Auto-generated method stub
		
		double nuevoPago = 20;
		System.out.print("Ingrese las horas de trabajo del empleado " + getName() + ": ");
        hour = scanner.nextInt();
        nuevoPago = nuevoPago * hour; 
        setPaid(nuevoPago);
        return getPaid();
	}
	
}
