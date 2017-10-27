import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Battlefield {
    private static int SPACE = 1;
    private static String FRIST = "[1]";
    private static String SECOND = "[2]";
    private static String THIRD = "[3]";
    private static String FOURTH = "[4]";

    private int width;
    private int height;

    private HashMap<Ships, Integer> ships;

    private String[][] battleMap;

    Battlefield(int w, int h) {
        width = w;
        height = h;

        battleMap = new String[height][width];
        ships = new HashMap<>(4);
        // Name - length
        ships.put(Ships.Destroyer, 1);
        ships.put(Ships.Cruiser, 2);
        ships.put(Ships.Submarine, 3);
        ships.put(Ships.Battleship, 4);

        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                battleMap[i][j] = "[0]";
            }
        }
    }


    void placeDestroyers() {
        ArrayList<HashMap<String, Integer>> cord = new ArrayList<>(Ships.Battleship.amount);
        Random random = new Random();

        HashMap<String, Integer> point = new HashMap<>(1);
        point.put("x", random.nextInt(9));
        point.put("y", random.nextInt(9));
        cord.add(point);

        Direction direction = calculateDirection(cord);

        int xPoint = point.get("x");
        int yPoint = point.get("y");

        battleMap[xPoint][yPoint] = FOURTH;



        System.out.println(point);
        System.out.println(direction);
    }

    private Direction calculateDirection(ArrayList<HashMap<String, Integer>> point) {
        Direction direction;
        int xPoint = point.get(0).get("x");
        int yPoint = point.get(0).get("y");

        Direction[] values = Direction.values();
        direction = values[(new Random().nextInt(values.length))];

        return direction;
    }

    void drawField() {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                System.out.print(battleMap[i][j]);
            }

            System.out.println();
        }
    }
}
