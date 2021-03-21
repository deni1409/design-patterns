package observer;

public class ObserverMain {

	public static void main(String[] args) {

		Trainer trainer = new Trainer();
		Observer<String> obs1 = new Viewer("Vesko");
		Observer<String> obs2 = new Viewer("Deni");
		Observer<String> obs3 = new Viewer("Semir");
		
		trainer.subscribe(obs1);
		trainer.subscribe(obs2);
		trainer.subscribe(obs3);
		
		trainer.setExercise("20 push ups");

	}
}
