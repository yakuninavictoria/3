public class Main {
    public static void main(String[] args) {
        FileInterface fileInterface=new Adapter();
        fileInterface.read();
        fileInterface.write();
    }
}
