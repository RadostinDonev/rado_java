package singleton;

public class SingletonEager {
    public static void main(String[] args) {

        Elvis elvis= Elvis.getInstance();
        Elvis elvis1=Elvis.getInstance();

        System.out.println(elvis);
        System.out.println();
        System.out.println(elvis1);

        // в многонишкова среда eager инициализацията ще работи, недостатъка е че се
        // заема памет в heap-a която не е ясно дали некога ще се използва

    }
}
