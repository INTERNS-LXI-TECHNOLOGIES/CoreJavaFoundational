package com.lxisoft.forest;
import com.lxisoft.forest.Animal;

public class Deer extends Animal implements Herbivores{

		//public void escape(){
		
public String veganFight(Animal animal1){
		
		//System.out.println("Selected 1st animal is Elephant so escaped from fight");
		
			if (this.animalStrengthLevel > animal1.getAnimalStrengthLevel()){
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-2);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-2);
			
			this.setAnimalAggressivenessLevel(this.getAnimalAggressivenessLevel()-2);
						
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-3);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-3);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalAggressivenessLevel()-3);
			
			return this.getAnimalName();
					
			
		} if (this.animalStrengthLevel < animal1.getAnimalStrengthLevel()){
			
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-2);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-2);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalHungerLevel()-2);
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-2);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-2);
			
			this.setAnimalAggressivenessLevel(this.getAnimalHungerLevel()-2);			
			
			return animal1.getAnimalName();
			
		}  if (this.animalStrengthLevel == animal1.getAnimalStrengthLevel()){
			
			animal1.setAnimalStrengthLevel(animal1.getAnimalStrengthLevel()-2);
			
			animal1.setAnimalHungerLevel(animal1.getAnimalHungerLevel()-2);
			
			animal1.setAnimalAggressivenessLevel(animal1.getAnimalHungerLevel()-2);
			
			this.setAnimalStrengthLevel(this.getAnimalStrengthLevel()-2);
			
			this.setAnimalHungerLevel(this.getAnimalHungerLevel()-2);
			
			this.setAnimalAggressivenessLevel(this.getAnimalHungerLevel()-2);			
			
			return animal1.getAnimalName();
					
		}	
			return null;
		}
		
 		public void escape(Animal animal1){
			
			System.out.println(this.getAnimalName() + " has seen " + animal1.getAnimalName() + " So escaped from " + animal1.getAnimalName()+ "\n");
		} 
}