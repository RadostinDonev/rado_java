package singleton;

public class Elvis {

    private static Elvis instance=new Elvis();

    public Elvis() {
    }

    public static Elvis getInstance(){
        return instance;
    }
}
