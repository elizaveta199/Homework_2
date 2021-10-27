 public class Main {
        public static void main(String[] args) {
            boolean isGreenLight = false;

            int speedOfPlayer1 = 1;
            int speedOfPlayer2 = 2;
            int speedOfPlayer3 = 3;

            int x=0;

            if ((!isGreenLight)&&(speedOfPlayer1>0)) {x++;}
            if ((!isGreenLight)&&(speedOfPlayer2>0)) {x++;}
            if ((!isGreenLight)&&(speedOfPlayer3>0)) {x++;}

            System.out.println("Выбыло игроков: " + x);

            // Допишите здесь логику так, что будет подсчитано и выведено
            // количество игроков, которые выбывают.
            // Если свет зелёный, то проходят все игроки (0 выбывают).
            // Если свет красный, то выбывает каждый, чья скорость не 0.
        }
    }
