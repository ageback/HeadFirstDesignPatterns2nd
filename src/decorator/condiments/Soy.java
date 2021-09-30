package decorator.condiments;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double soyCost = 0;
        if (getSize() == Size.TALL) {
            soyCost = 10;
        } else if (getSize() == Size.GRANDE) {
            soyCost = 15;
        } else {
            soyCost = 20;
        }
//        return beverage.cost() + .15;
        return beverage.cost() + soyCost;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
