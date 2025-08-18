package observer;

import java.util.ArrayList;
import java.util.List;

//Sujeito
public class VirtualMachine {
    private List<IObserver> assinantes = new ArrayList<IObserver>();
    private double memoryUsage;

    void addObservers(IObserver observer){
        this.assinantes.add(observer);
    }

    void removeObserver(int position){
        this.assinantes.remove(position);
    }

    void setMemoryUsage(double memoryUsage){
        this.memoryUsage = memoryUsage;
        notifyObservers();
    }

    void notifyObservers(){
        for(IObserver assinante: assinantes){
            assinante.update(memoryUsage);
        }
    }


}
