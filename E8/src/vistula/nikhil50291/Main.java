package vistula.nikhil50291;

public class Main {
    public static void main(String[] args) {

        Animal animal[]= new Animal[6];


        animal[1]=new Dog("Tom",3,16,"Carnivora","German Shepard");
        animal[2]=new Fish("CatFish",2,1,"Yellow");
        animal[4]=new Bird("Falcon",4,10,"Brown");


	      /*  animal[2].getVoiceNikhil50291();
	        animal[4].getVoiceNikhil50291();
	*/


        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Tim",3,14,"Carnivor","Bulldog");



        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();


        for (Animal b: animal){
            b.moveNikhil50291();
        }

        for (Animal b: animal) {
            AnimalName.name(b.getNameNikhil50291());
        }

    }
}
