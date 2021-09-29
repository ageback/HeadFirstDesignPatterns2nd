package decorator;

public abstract class Beverage {
    protected String description = "Unknown decorator.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
