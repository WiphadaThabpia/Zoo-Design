package Lib;

  public class Lion extends Mammal implements Swimmable{
    public Lion(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Clicking sounds";
    }

    @Override
    public String swim() {
        return "The dolphin playfully swims in the sea. ";
    }
}  
