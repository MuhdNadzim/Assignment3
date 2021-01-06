package Assignment2;

public class BikeExercise extends Gym{
		String caoch,equipment,set,calories;
                
public void infoGym(){
    
    setCoach("En.Ahmad");
    setEquipment("Bikemill");
    setSet("30 minutes");
    setCalories("4000");
    
    System.out.println("\nName: "+getCoach());
    System.out.println("Equipment: "+getEquipment());
    System.out.println("Set: "+getSet());
    System.out.println("Calories: "+getCalories());
}
}