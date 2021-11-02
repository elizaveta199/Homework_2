public class Game {

    public static String winOrLose(int speedOfPlayer) {
        String x;
        if ((!Main.isGreenLight) && (speedOfPlayer > 0)) {
            x = "Игрок выбыл";
        } else {
            x = "Игрок выйграл";
        }
        return x;
    }
}

