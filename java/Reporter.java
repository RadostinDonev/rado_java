import java.sql.SQLException;

public class Reporter extends Thread{

    @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                    stat1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
    private void stat1() {
        //todo
    }
}