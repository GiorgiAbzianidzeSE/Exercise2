package excersices;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle;
        double area = rectangle.areaCalculator(); // გამოიწვია ერორი : variable rectangle might not have been initialized;

        Rectangle rectangle1 = null;
        double perimeter = rectangle1.perimeterCalculator(); // გამოიწვია შეცდომა : NullPointerException;

        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getWeight());
        //ორივე მეთოდის შედეგი არის 0,0 რადგან default-ად გლობალურ ცვლადებს ნული ენიჭება(ან null თუ ობიექტია)

        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();
        System.out.println(rectangle3 == rectangle4); // აბრუნებს false რადგან ადარებს მისამართებს ობიექტების

        rectangle3 = rectangle4;
        System.out.println(rectangle3 == rectangle4); // აბრუნებს true რადგან ორივე მიმთითებელი ერთსა და იმავე ობიექტზე მიუთითებს

        Rectangle rectangle5 = new Rectangle();
        Rectangle rectangle6 = new Rectangle();
        rectangle5 = rectangle6;

        rectangle5.setHeight(15);
        System.out.println(rectangle6.getHeight()); // შედეგია 15,0 რადგან rectangle5-მა შეცვალა ობიექტი რომელზეც მიუთითებს rectangle6-ც

    }
}
