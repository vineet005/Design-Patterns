package Builder;

//Builder Pattern is used when an object needs to be created with many possible configurations and parameters,
//some of which may be optional!
public class MainBuilder {
    public static void main(String[] args) {
        MealBuilder veggie_Meal = new VeggieMeal();
        MealDirector director = new MealDirector(veggie_Meal);
        Meal veggie_Construct = director.construct_Meal();
        veggie_Construct.displayMeal();

        MealBuilder chicken_Meal = new ChickenMeal();
        director = new MealDirector(chicken_Meal);
        Meal chicken_Construct = director.construct_Meal();
        chicken_Construct.displayMeal();
    }
}
