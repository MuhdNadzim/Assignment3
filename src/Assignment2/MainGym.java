package Assignment2;

public class MainGym {

	public static void main(String[] args) {
		
            Weightlifting w = new Weightlifting();
            Running r = new Running();
            BikeExercise b = new BikeExercise();
            
            w.infoGym();
            r.infoGym();
            b.infoGym();
        }
}