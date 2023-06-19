public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    int dIng;

    public Burger(){}

    // Конструктор на стандартний бургер
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Склад звичайного бурегера: "
                +this.bun + ", " + this.meat +", "+ this.cheese +", "+ this.greens +", "+ this.mayonnaise);
    }

    // Конструктор на дієтичний бургер
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Склад дієтичного бурегера: "
                + this.bun + ", " + this.meat +", "+ this.cheese +", "+ this.greens);
    }

    // Конструктор на бургер з подвійним м'ясом
    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, int dIng) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.dIng = dIng;
        if (this.dIng == 2){
            System.out.println("Склад бурегера з подвійним м'ясом: "
                    + this.bun + ", " + this.dIng + " " + this.meat +", "+ this.cheese +", "+ this.greens +", "+ this.mayonnaise);
        }
    }

}
