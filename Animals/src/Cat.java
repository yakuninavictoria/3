public class Cat implements Animal {
    public void information() {
        System.out.println("Information:");
    }
    @Override
    public void breed(){
        System.out.println("Siamese");
    }
    @Override
    public void height(){
        System.out.println("Height: 20");;
    }
    @Override
    public void weight(){
        System.out.println("Weight: 2");;
    }
    @Override
    public void diet(){
        System.out.println("Mixed feeding");
    }
}
