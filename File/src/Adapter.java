class Adapter implements FileInterface{
    CSV csv= new CSV();
    JSON json=new JSON();
    XML xml=new XML();
    public void read(){
        csv.read();
        json.read();
        xml.read();
    }
    public void write(){
        csv.write();
        json.write();
        xml.write();
    }
}
