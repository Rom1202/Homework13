public class Main {
    public static void main(String[] args) {
        Aurhor pushkin = new Aurhor("Александр", "Пушкин");
        Aurhor lermontov = new Aurhor("Михаил", "Лермонтов");
        Book capitanDaughter =new Book("Капитанская дочка ", pushkin,1836);
        Book demon = new Book("Демон", lermontov,1839);

        capitanDaughter.setYear(1841);
        System.out.println(pushkin.toString());
        System.out.println(capitanDaughter.toString());

        System.out.println(lermontov.hashCode());
        System.out.println(capitanDaughter.hashCode());

        System.out.println(capitanDaughter.equals(demon));
        System.out.println(capitanDaughter.equals(capitanDaughter));
    }
}