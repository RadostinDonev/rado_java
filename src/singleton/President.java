package src.singleton;

public class President {

    private static President instance;

    private President() {
    }
    //lazy
    public static President getInstance(){
        if(instance==null){
            instance=new President();
        }
        return instance;
    }
}
