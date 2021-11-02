import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void shouldPlayerLoseOrWin() {
        int a = 3;
        String actual = Game.winOrLose(a);
        String expected = "";
        if (!Main.isGreenLight) {
            expected = "Игрок выбыл";
        } else {
            expected = "Игрок выйграл";
        }
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayerWinZero() {
        int a = 0;
        String actual = Game.winOrLose(a);
        String expected = "Игрок выйграл";
        Assertions.assertEquals(expected, actual);
    }
}