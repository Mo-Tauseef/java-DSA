package Transport;

public class vehicle {
    public String name;
    public String model;
    public int nooftyers;

    vehicle(){
        this.name = "";
        this.model = "";
        this.nooftyers = -1;
    }

    vehicle(String name,String model,int nooftyers){
        this.name = name;
        this.model = model;
        this.nooftyers = nooftyers;
    }
    void startengine(){
        System.out.printf("engine is starting of %s :%s\n", name, model);
    }
    void stopengine(){
        System.out.printf("engine is stoping of %s :%s\n", name, model);
    }
}
