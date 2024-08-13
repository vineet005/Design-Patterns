package Builder;

public class ChickenMeal implements MealBuilder{
    private final Meal MEAL = new Meal();
    @Override
    public void buildBurger() {
        MEAL.setBurger("Chicken Burger");
    }

    @Override
    public void buildDrink() {
        MEAL.setDrink("Monster");
    }

    @Override
    public void buildSide() {
        MEAL.setSide("Peri Peri");
    }

    @Override
    public Meal getMeal() {
        return MEAL;
    }
}
