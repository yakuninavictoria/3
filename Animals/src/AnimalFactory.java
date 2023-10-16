public interface AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Parrot":
                return new Parrot();
            default:
                return null;
        }
    }
}
