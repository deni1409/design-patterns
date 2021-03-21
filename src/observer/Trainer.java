package observer;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements Observable<String> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private final List<Observer<String>> observers;
	private String exercise;
	
	public Trainer() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer<String> topicSubscriber) {
		this.observers.add(topicSubscriber);
	}

	@Override
	public void unsubscribe(Observer<String> topicSubscriber) {
		this.observers.remove(topicSubscriber);
	}

	@Override
	public void notifyObservers() {
		for(Observer<String> observer: this.observers) {
			observer.update(this.getExercise());
		}
	}

	public List<Observer<String>> getObservers() {
		return observers;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
	}

}
