package vistula.nikhil50291;


public class Fish extends Animal implements AnimalBehavior,AnimalMove{
    private String scaleColorNikhil50291;

    public Fish(){
        super();
        scaleColorNikhil50291 = "NN";
    }

    public Fish(String nameNikhil50291, int ageNikhil50291 , int weightNikhil50291, String scaleColorNikhil50291){
        super(nameNikhil50291, ageNikhil50291, weightNikhil50291);
        this.scaleColorNikhil50291 = scaleColorNikhil50291;
    }

    public Fish(int ageNikhil50291 , String scaleColorNikhil50291){
        super(ageNikhil50291);
        this.scaleColorNikhil50291 = scaleColorNikhil50291;
    }

    public void drinkWaterNikhil50291(){
        System.out.println("Gulp gulp");
    }

    @Override
    public void getVoiceNikhil50291() {
        System.out.println("Fish is making sounds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }

    @Override
    public void moveNikhil50291() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eatNikhil50291(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorNikhil50291() {
        return scaleColorNikhil50291;
    }

    public void setScaleColorNikhil50291(String scaleColorNikhil50291) {
        this.scaleColorNikhil50291 = scaleColorNikhil50291;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "scaleColorNikhil50291='" + scaleColorNikhil50291 + '\'' +
                '}';
    }
}