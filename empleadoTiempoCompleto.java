package AMC;

public class empleadoTiempoCompleto extends empleado{

	public empleadoTiempoCompleto(String name, String id, double paid) {
		super(name, id, paid);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePaid() {
		// TODO Auto-generated method stub
        double nuevoPago = 460;
        setPaid(nuevoPago);
        return getPaid();
	}

}
