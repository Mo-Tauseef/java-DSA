package Transport;

public class car extends vehicle{
    public int noOfdoors;
    public String tranmissiontyoe;

    car(String name, String model, int nootyers, int noOfdoors, String tranmissiontyoe ){
        super(name, model, nootyers);
        this.noOfdoors = noOfdoors;
        this.tranmissiontyoe = tranmissiontyoe;
    }
    public void startAC(){
        System.out.println("AC started of " + name);
    }
}
