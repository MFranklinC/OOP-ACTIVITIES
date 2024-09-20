public class Dog {
    String name;
    boolean isMale;
    int puppies;
    String[] doggy = new String[3];


    public void bark(){
        System.out.println("Woof! Woof!");
    }

    public void setName(String Hatdog){
        this.name = Hatdog;
    }

    public String getName(){
        return this.name;
    }

    public void showName(){
        System.out.println("Doggy name is: Hatdog " + this.name);
    }

    public String nameofPuppies(){
        return name;
    }
    public int numberofPuppies(){
        return puppies;
    }

}
