package observer;

public class Admin implements IObserver{
    @Override
    public void update(double memoryUsage) {
        // TODO Auto-generated method stub
        if(memoryUsage > 50)
            System.out.println("Notificação para usuário admin! Memória ultrapassou limite definido em 50.");
    }
}
