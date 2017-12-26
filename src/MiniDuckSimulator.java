public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck md = new ModelDuck();
        md.performFly();
        md.setFlyBehavior(new FlyRocketPowered());
        md.performFly();
    }
}
