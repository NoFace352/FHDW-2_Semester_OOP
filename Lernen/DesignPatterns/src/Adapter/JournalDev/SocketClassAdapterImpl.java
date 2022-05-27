package Adapter.JournalDev;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    /**
     * Using inheritance for adapter pattern
     */

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt volt = getVolt();
        return convertVolt(volt, 40);
    }

    private Volt convertVolt(Volt volts, int i) {
        return new Volt(volts.getVolts() / i);
    }
}
