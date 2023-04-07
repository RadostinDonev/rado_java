public abstract class Worker extends Thread {
    private String name;
    private int age;
    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
