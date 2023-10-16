abstract class Figure {
    Shapes shapes;
    public Figure(Shapes shapes){
        this.shapes=shapes;
    }
    abstract void draw();
}
