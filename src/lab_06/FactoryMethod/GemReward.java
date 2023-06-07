package lab_06.FactoryMethod;

public class GemReward implements GameItem {
    @Override
    public void sharedMethod() {
        System.out.println("GemReward opened");
    }
}
