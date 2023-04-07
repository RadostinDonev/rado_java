public class ServiceForCar {

    private String name;

    private int carsIn = 0;
    private final int maxCars;

    public ServiceForCar(String name, int maxCars){
        this.maxCars = maxCars;
        this.name=name;
    }

    public synchronized void put(){
        try {
            while(carsIn >= maxCars){
                wait();

            }
            carsIn++;
            notifyAll();
        }
        catch (InterruptedException e){
            System.out.println("ole male");
        }
    }

    public synchronized void take(){
        try {
            while(carsIn == 0){
                wait();
            }
            carsIn--;
            notifyAll();

        }
        catch (InterruptedException e){
            System.out.println("ole male");
        }
    }


}
