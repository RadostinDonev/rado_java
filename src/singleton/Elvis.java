package src.singleton;

public class Elvis {

    private static Elvis instance=new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance(){
        return instance;
    }
}
