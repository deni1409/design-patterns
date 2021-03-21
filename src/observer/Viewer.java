package observer;

public class Viewer implements Observer<String> {

	private String name;
	
	public Viewer(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String topic) {
		System.out.println(this.getName() + " started exercise: " + topic);
	}
}
