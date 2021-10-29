public class Utils {

    public static boolean winOrLose ( int speedOfPlayer, boolean isGreenLight) {
        // boolean isGreenLight=false;
        boolean x=false;
        if ((!isGreenLight)&&(speedOfPlayer>0)) {x=false;} else {x=true;};
        return  x;
    }
}

