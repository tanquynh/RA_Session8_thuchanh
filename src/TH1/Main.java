package TH1;
import TH1.Cat;
import TH1.Dog;
public class Main {
    public static void main(String[] args) {
        // Taoj đối tượng từ các lớp
        Animal animal1 = new Animal("Pig");
        Dog dog1 = new Dog("Becgie", "black");
        Dog dog2 = new Dog("Pug", "white");
        Cat cat = new Cat("Dora");
        // Sử dụng phương pháp get set truy cập vào thay đổi thuộc tính
        System.out.println("Animal 's name is " + animal1.getName() );
        System.out.println("Animal 's name is " + dog1.getName()  + ", color " + dog1.getColor());
        System.out.println("Sound " + dog1.makeSound());
        System.out.println("Animal 's name is " + dog2.getName() + ", color " + dog2.getColor());
        System.out.println("Sound " + dog2.makeSound());
        System.out.println("Animal 's name is " + cat.getName());
        System.out.println("Sound " + cat.makeSound());

    }
}
