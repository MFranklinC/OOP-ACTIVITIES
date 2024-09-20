public class Activity{
    public static void main(String[] args) {
        Dog aso = new Dog();
        aso.name ="Hatdog";
        aso.puppies = 3;

        aso.doggy[0]= "chu-chu";
        aso.doggy[1]= "blacky";
        aso.doggy[2]= "chupapi";

        System.out.println(aso.nameofPuppies());
        aso.bark();
        System.out.println(aso.numberofPuppies());

        for (int i = 0; i < 3; i++) {
            System.out.println(aso.doggy[i]);

        }
    }
}