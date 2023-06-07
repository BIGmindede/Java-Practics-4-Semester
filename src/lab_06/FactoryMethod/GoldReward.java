package lab_06.FactoryMethod;

public class GoldReward implements GameItem {

    @Override
    public void sharedMethod() {
        System.out.println("GoldReward opened");
    }
}
