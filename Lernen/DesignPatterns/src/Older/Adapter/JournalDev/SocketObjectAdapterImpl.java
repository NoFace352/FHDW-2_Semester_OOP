package Older.Adapter.JournalDev;

public class SocketObjectAdapterImpl implements SocketAdapter {

    /**
     * Using Composition for adapter pattern
     */
    private final Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = socket.getVolt();
        return convertVolt(volt, 40);
    }

    public Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolts() / i);
    }
}
