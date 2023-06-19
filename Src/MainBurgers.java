public class MainBurgers {
    public static void main(String[] args) {
        String bun = "Булочка";
        String meat = "М'ясо";
        String cheese = "Сир";
        String greens = "Зелень";
        String mayonnaise = "Майонез";
        int dIng = 2;
        Burger b1 = new Burger(bun, meat, cheese, greens, mayonnaise);
        Burger b2 = new Burger(bun, meat, cheese, greens);
        Burger b3 = new Burger(bun, meat, cheese, greens, mayonnaise, dIng);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
