public class Demo {
    public static void main(String[] args) throws InterruptedException {

      long start=System.currentTimeMillis();


        AssemblyLine assemblyLine1=new AssemblyLine("Type1" );
        assemblyLine1.addComponent(new Tire());
        assemblyLine1.addComponent(new Tire());
        assemblyLine1.addComponent(new Tire());
        assemblyLine1.addComponent(new Tire());
        assemblyLine1.addComponent(new Seat());

        AssemblyLine assemblyLine2=new AssemblyLine("Type2" );
        assemblyLine2.addComponent(new Seat());
        assemblyLine2.addComponent(new Seat());
        assemblyLine2.addComponent(new Seat());
        assemblyLine2.addComponent(new Seat());

        AssemblyLine assemblyLine3=new AssemblyLine("Type3" );
        assemblyLine3.addComponent(new Engine());
        assemblyLine3.addComponent(new Frame());
        assemblyLine1.start();
        assemblyLine2.start();
        assemblyLine3.start();

        assemblyLine1.join();
        assemblyLine2.join();
        assemblyLine3.join();
        System.out.println("Worker ASSEMBLES THE CAR");

        long duration = System.currentTimeMillis()-start;
        System.out.println("Done in:"+ duration);
    }
}
