package factoryMethodLaboratory;

public class Main {
    public static void main(String[] args) {

        PetFactory dogFactory = new DogFactory();
        Pet dog = dogFactory.createPet();
        dog.speak();

        PetFactory catFactory = new CatFactory();
        Pet cat = catFactory.createPet();
        cat.speak();
    }
}
