package Builder;

public class VeggieMeal implements MealBuilder{
    private final Meal MEAL = new Meal();
    @Override
    public void buildBurger() {
        MEAL.setBurger("Veggie Burger");
    }

    @Override
    public void buildDrink() {
        MEAL.setDrink("Ice Tea");
    }

    @Override
    public void buildSide() {
        MEAL.setSide("Potato Fries");
    }

    @Override
    public Meal getMeal() {
        return MEAL;
    }
}
