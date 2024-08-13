package Builder;

public class MealDirector {
    private final MealBuilder BUILDER;

    public MealDirector(MealBuilder builder){
        this.BUILDER = builder;
    }

    public Meal construct_Meal(){
        BUILDER.buildBurger();
        BUILDER.buildDrink();
        BUILDER.buildSide();
        return BUILDER.getMeal();
    }
}
