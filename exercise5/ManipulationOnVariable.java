package excersices;

public class ManipulationOnVariable {
    public static void main(String[] args) {
        int i;
        if(++i == 0){ // Variable 'i' might not have been initialized
            int j = 5;
        }
        int j = 11;// შეცდომა არ დაფიქსირდა

    }
}
