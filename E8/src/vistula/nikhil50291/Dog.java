package vistula.nikhil50291;


public class Dog implements AnimalBehavior,AnimalMove{
    private String breedNikhil50291;

    Dog(){
        super();
        breedNikhil50291 = "NN";
    }

    public Dog(String nameNikhil50291 , int ageNikhil50291,int weightNikhil50291,String rzadNikhil50291, String breedNikhil50291){
        super(nameNikhil50291,ageNikhil50291,weightNikhil50291,rzadNikhil50291);
        this.breedNikhil50291 = breedNikhil50291;
    }

    public Dog(int ageNikhil50291, String rzadNikhil50291, String breedNikhil50291){
        super( ageNikhil50291, rzadNikhil50291);
        this.breedNikhil50291 = breedNikhil50291;
    }

    public void sportNikhil50291(){
        System.out.println("The dog is retrieving.");
    }

    public void drinkMilkNikhil50291() {
        System.out.println("The dog is drinking milk.");
    }

    @Override
    public void getVoiceNikhil50291() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eatNikhil50291(String FoodName) {
        System.out.println("The dog is eating: "+ FoodName);
    }

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void moveNikhil50291() {
        System.out.println("Dog is running");
    }

    public String getBreedNikhil50291() {
        return breedNikhil50291;
    }

    public void setBreedNikhil50291(String breedNikhil50291) {
        this.breedNikhil50291 = breedNikhil50291;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breedNikhil50291='" + breedNikhil50291 + '\'' +
                '}';
    }
}