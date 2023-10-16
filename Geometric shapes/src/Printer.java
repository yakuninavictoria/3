class Printer implements Shapes {
    @Override
    public void draw(String geometry){
        System.out.println(geometry+" on printer");
    }
}