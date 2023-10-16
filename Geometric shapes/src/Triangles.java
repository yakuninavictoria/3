class Triangles extends Figure{
    public Triangles(Shapes shapes){
        super(shapes);
    }
    @Override
    void draw(){
        shapes.draw("Shapes are triangles");
    }
}