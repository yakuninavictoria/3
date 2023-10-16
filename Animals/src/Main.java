
public class Main {
    public static void main(String[] args) {

        Animal dog = AnimalFactory.createAnimal("Dog");
        Animal cat = AnimalFactory.createAnimal("Cat");
        Animal parrot = AnimalFactory.createAnimal("Parrot");
        dog.information();
        dog.breed();
        dog.height();
        dog.weight();
        dog.weight();
        cat.information();
        cat.breed();
        cat.height();
        cat.weight();
        cat.diet();
        parrot.information();
        parrot.breed();
        parrot.height();
        parrot.weight();
        parrot.diet();
    }
}
