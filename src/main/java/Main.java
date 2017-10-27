public class Main {
    public static void main(String[] args) {
        Battlefield battlefield = new Battlefield(10, 10);

        battlefield.placeDestroyers();
        battlefield.drawField();
        System.out.println("finish");
    }
}
