package singleton;

public class SingletonLazy {
    public static void main(String[] args) {

        President president=President.getInstance();
        President president1=President.getInstance();

        System.out.println(president);
        System.out.println();
        System.out.println(president1);

        // мързеливата инициализация не е подходяща за многонишкова среда, понеже има опасност да се създадат повече от 1 обект;
        // може да се синхронизира със ключовата дума /synchronized/ но изпълнението са забавя в много нишкова среда

    }
}

