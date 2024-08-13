package Builder;

public class Meal {
    private String burger;
    private String drink;
    private String side;

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void displayMeal(){
        System.out.println("Meal: " + burger + ", " + drink + ", " + side);
    }
}
