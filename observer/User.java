package observer;

public class User implements IObserver{
    @Override
    public void update(double memoryUsage) {
        // TODO Auto-generated method stub
        if(memoryUsage > 850)
            System.out.println("Notificação para usuário! Memória ultrapassou limite definido em 850.");
    }
}
