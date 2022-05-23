package vistula.nikhil50291;



abstract class Animal implements AnimalMove ,AnimalName{
    private String nameNikhil50291;
    private int ageNikhil50291;
    private int weightNikhil50291;

    public Animal(){
        ageNikhil50291 = weightNikhil50291 = 10;
        nameNikhil50291 = "NN";
    }

    public Animal(String nameNikhil50291, int ageNikhil50291, int weightNikhil50291){
        this.nameNikhil50291 = nameNikhil50291;
        this.ageNikhil50291 = ageNikhil50291;
        this.weightNikhil50291 = weightNikhil50291;
    }

    public Animal(int ageNikhil50291){
        this.ageNikhil50291 = ageNikhil50291;
    }

    public abstract void eatNikhil50291(String FoodName);

    public abstract void moveNikhil50291();

    public abstract void getVoiceNikhil50291();

    public String getNameNikhil50291() {
        return nameNikhil50291;
    }

    public void setNameNikhil50291(String nameNikhil50291) {
        this.nameNikhil50291 = nameNikhil50291;
    }

    public int getAgeNikhil50291() {
        return ageNikhil50291;
    }

    public void setAgeNikhil50291(int ageNikhil50291) {
        this.ageNikhil50291 = ageNikhil50291;
    }

    public int getWeightNikhil50291() {
        return weightNikhil50291;
    }

    public void setWeightNikhil50291(int weightNikhil50291) {
        this.weightNikhil50291 = weightNikhil50291;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameNikhil50291='" + nameNikhil50291 + '\'' +
                '}';
    }
}