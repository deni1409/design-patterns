import exercise.Exercise;

public class Trainer {

	public void setExercise(Trainee trainee, Exercise exercise) {
		System.out.println("Trainer assigned exercise: " + exercise.getName());
		trainee.doExercise(exercise);
	}

}
