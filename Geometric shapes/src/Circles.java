class Circles extends Figure{
    public Circles(Shapes shapes){
        super(shapes);
    }
    @Override
    void draw(){
        shapes.draw("Shapes are circles");
    }
}
