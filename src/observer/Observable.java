package observer;

public interface Observable<T> {
	void subscribe(Observer<T> topicSubscriber);
	void unsubscribe(Observer<T> topicSubscriber);
	void notifyObservers();
}
