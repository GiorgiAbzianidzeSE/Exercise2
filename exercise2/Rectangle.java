package excersices;

public class Rectangle {

    private float height;
    private float weight;

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return this.height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return this.weight;
    }

    public double perimeterCalculator(){
        return (this.weight + this.height) * 2;
    }

    public double areaCalculator(){
        return this.height * this.weight;
    }

}
