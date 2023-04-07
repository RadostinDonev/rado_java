import java.io.File;

public class Demo {
    public static void main(String[] args) {
        ServiceForCar service=new ServiceForCar("Pri bai Gosho",100);
        for (int i = 0; i < 2; i++) {
            Fitter fitter=new Fitter("Gosho"+ i,33+i);

        }


    }
}
