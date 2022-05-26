package excersices;

public class CompareArea {
    public int compareArea(Rectangle rectangle1 , Rectangle rectangle2){
        if(rectangle1.areaCalculator() == rectangle2.areaCalculator()) return 0;
        return rectangle1.areaCalculator() > rectangle2.areaCalculator() ? 1 : -1;
    }
}
