package AMC;

public class empleado {
	
	private String name, id;
	private double paid;
		
	public empleado() {
		super();
	}

	public empleado(String name, String id, double paid) {
		super();
		this.name = name;
		this.id = id;
		this.paid = paid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}
	
	public double calculatePaid() {
		return paid;	
	}
	
	public String show(){
		return "\nNombre: "+name+"\nTipo: "+id+"\nSalario: "+calculatePaid();
	}
	
}
