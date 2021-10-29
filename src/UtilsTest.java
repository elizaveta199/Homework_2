import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void shouldPlayerWin(){
        int a=3;
        boolean actual=Utils.winOrLose(a, false);
        boolean expected=false;

        Assertions.assertEquals(expected,actual, "Player is lose");
    }

    @Test
    public void shouldPlayerLose(){
        int a=0;
        boolean actual=Utils.winOrLose(a, false);
        boolean expected=true;

        Assertions.assertEquals(expected,actual, "Player is win");
    }

    @Test
    public void shouldPlayerWin_1(){
        int a=3;
        boolean actual=Utils.winOrLose(a, true);
        boolean expected=true;

        Assertions.assertEquals(expected,actual, "Player is win");
    }

    @Test
    public void shouldPlayerWin_2(){
        int a=0;
        boolean actual=Utils.winOrLose(a, true);
        boolean expected=true;

        Assertions.assertEquals(expected,actual, "Player is win");
    }

}
