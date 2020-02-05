import java.io.Serializable;

public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String model;
	public String getName() {
		return name;
	}
	public String getModel() {
		return model;
	}
	public Vehicle(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", model=" + model + "]";
	}
	
	
	
	
}
