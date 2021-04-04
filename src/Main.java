import exercise.Exercise;
import factory.ExerciseFactory;
import observer.Observer;

public class Main {

	public static void main(String[] args) {
		ExerciseFactory exerciseFactory = new ExerciseFactory();
		Exercise up = exerciseFactory.getExercise("Get Up");
		Exercise down = exerciseFactory.getExercise("Lay Down");

		Trainer trainer = new Trainer();
		Trainee trainee = new Trainee("Mark");

		Observer<Exercise> obs1 = new Viewer("Vesko");
		Observer<Exercise> obs2 = new Viewer("Deni");
		Observer<Exercise> obs3 = new Viewer("Semir");

		trainee.subscribe(obs1);
		trainee.subscribe(obs2);
		trainee.subscribe(obs3);
		
		trainer.setExercise(trainee, up);
		trainer.setExercise(trainee, down);

	}
}
