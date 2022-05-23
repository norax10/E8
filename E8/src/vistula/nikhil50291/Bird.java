package vistula.nikhil50291;


public class Bird extends Animal implements AnimalMove,AnimalBehavior{
    private String featherColorNikhil50291;



    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    public Bird(){
        super();
        featherColorNikhil50291 ="NN";


    }

    public Bird (String nameNikhil50291, int ageNikhil50291, int weightNikhil50291, String featherColorNikhil50291){
        super(nameNikhil50291, ageNikhil50291, weightNikhil50291);
        this.featherColorNikhil50291 = featherColorNikhil50291;
    }

    public Bird(int ageNikhil50291 , String featherColorNikhil50291){
        super(ageNikhil50291);
        this.featherColorNikhil50291 = featherColorNikhil50291;
    }

    public void takingFlightNikhil50291(){
        System.out.println("Flap flap");
    }



    @Override
    public void getVoiceNikhil50291() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatNikhil50291(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    @Override
    public void moveNikhil50291() {
        System.out.println("Bird moves");
    }

    public String getFeatherColorNikhil50291() {
        return featherColorNikhil50291;
    }



    public void setFeatherColorNikhil50291(String featherColorNikhil50291) {
        this.featherColorNikhil50291 = featherColorNikhil50291;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorNikhil50291='" + featherColorNikhil50291 + '\'' +
                '}';
    }
}