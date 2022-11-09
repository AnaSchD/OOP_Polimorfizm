public class DiagnosticsException extends Exception {

    private Transport transport;

    public DiagnosticsException() {
    }

    public DiagnosticsException(String message) {
        super(message);
    }

    public DiagnosticsException(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }
}
