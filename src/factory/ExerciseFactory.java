package factory;

import exercise.Down;
import exercise.Exercise;
import exercise.Up;

public class ExerciseFactory {
    public Exercise getExercise(String exerciseName){
        return exerciseName.equalsIgnoreCase("Get Up")
                ? new Up()
                : exerciseName.equalsIgnoreCase("Lay Down")
                    ? new Down()
                    : null;
    }
}
