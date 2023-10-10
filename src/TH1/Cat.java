package TH1;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
    @Override
    public String makeSound(){
        return "Meo meo";
    }
}
