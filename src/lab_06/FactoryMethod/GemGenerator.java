package lab_06.FactoryMethod;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
