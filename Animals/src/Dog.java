public class Dog implements Animal {
    public void information() {
        System.out.println("Information:");
    }
    @Override
    public void breed(){
        System.out.println("German Shepherd");
    }
    @Override
    public void height(){
        System.out.println("Height: 50");;
    }
    @Override
    public void weight(){
        System.out.println("Weight: 25");;
    }
    @Override
    public void diet(){
        System.out.println("Mixed feeding");
    }
}
