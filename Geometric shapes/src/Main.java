public class Main {
    public static void main(String[] args) {
        Figure figure = new Circles(new Plotter());
        Figure figure1 = new Triangles(new Printer());
        Figure figure2 = new Squares(new Screen());
        figure.draw();
        figure1.draw();
        figure2.draw();
    }
}
