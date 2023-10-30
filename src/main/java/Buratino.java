public class Buratino {
    public static void main(String[] args) {
        final int applesBuratino = 23;
        System.out.println("Количество яблок у Буратино - " + applesBuratino);

        final int applesBarabas = 13;
        System.out.println("Количество яблок, которые хочет отобрать Барабас - " + applesBarabas);

        final int remainingApples = applesBuratino - applesBarabas;
        System.out.println("У Буратино осталось - " + remainingApples + " яблок");
    }
}
