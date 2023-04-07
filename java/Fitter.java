public class Fitter extends Worker{

    private ServiceForCar order;
    public Fitter(String name, int age) {
        super(name, age);
        this.order=order;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            //DBManager.getInstance().
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
