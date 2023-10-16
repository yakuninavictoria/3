class Parrot implements Animal {
    public void information() {
        System.out.println("Information:");
    }
    @Override
    public void breed(){
        System.out.println("Cockatoo");
    }
    @Override
    public void height(){
        System.out.println("Height: 20");;
    }
    @Override
    public void weight(){
        System.out.println("Weight: 0.8");;
    }
    @Override
    public void diet(){
        System.out.println("Dry feeding");
    }

}
