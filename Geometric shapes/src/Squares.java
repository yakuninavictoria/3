class Squares extends Figure{
    public Squares(Shapes shapes){
        super(shapes);
    }
    @Override
    void draw(){
        shapes.draw("Shapes are squares");
    }
}
