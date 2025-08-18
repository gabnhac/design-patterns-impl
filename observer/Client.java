package observer;

public class Client {
    public static void main(String[] args) {
        VirtualMachine virtualMachine = new VirtualMachine();
        IObserver usuario = new User();
        IObserver admin = new Admin();

        virtualMachine.addObservers(usuario);
        virtualMachine.addObservers(admin);

        virtualMachine.setMemoryUsage(40);
    }
}
