import exercise.Exercise;
import observer.Observer;

public class Viewer implements Observer<Exercise> {

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
	public void update(Exercise topic) {
		System.out.println(this.getName() + " started exercise: ");
		topic.execute();

	}
}
