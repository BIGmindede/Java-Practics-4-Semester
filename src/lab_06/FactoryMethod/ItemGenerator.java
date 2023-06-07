package lab_06.FactoryMethod;

public abstract class ItemGenerator {

    public abstract GameItem createItem();

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.sharedMethod();
    }
}
