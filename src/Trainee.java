import exercise.Exercise;
import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Trainee implements Observable<Exercise> {

    private final List<Observer<Exercise>> observers;
    private String name;
    private Exercise exercise;

    public Trainee(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer<Exercise> topicSubscriber) {
        this.observers.add(topicSubscriber);
    }

    @Override
    public void unsubscribe(Observer<Exercise> topicSubscriber) {
        this.observers.remove(topicSubscriber);
    }

    @Override
    public void notifyObservers() {
        for(Observer<Exercise> observer: this.observers) {
            observer.update(this.getExercise());
        }
    }

    public List<Observer<Exercise>> getObservers() {
        return observers;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void doExercise(Exercise exercise) {
        System.out.println(name + " is doing: ");
        exercise.execute();
        this.exercise = exercise;
        this.notifyObservers();
    }

}
