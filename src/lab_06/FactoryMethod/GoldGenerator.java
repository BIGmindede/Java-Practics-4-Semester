package lab_06.FactoryMethod;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
