package quoters;

public class TerminatorQuater implements Quoter {
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public TerminatorQuater() {

    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuate() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("this message = " + message);
        }
    }
}
