package snakeAndLadder;

public class SnakeLadder {

    static int finalRolled = 0;
    private static int position = 0;

    public static void main(String[] args) {


        SnakeLadder snakeLadder = new SnakeLadder();
        rollDice();

        snakeLadder.play(rollDice());



    }

    public static int rollDice() {
        int rolled = ((int) (Math.random() * 6) + 1);
        if (rolled > 0 && rolled < 6) {

            System.out.println("You have rolled : " + rolled);
            // System.out.println(finalRolled);
        } else if (rolled == 6) {
            System.out.println("Play again Champ!!!");
            System.out.println("You have rolled : " + rolled);
            finalRolled += 6;
            System.out.println(finalRolled);
        }
        return rolled;

    }


    public int play(int finalRolled) {

        position += finalRolled;
            if (position < 101)
            {

                                    //Ladders

                switch (position) {

                    case 0 -> System.out.println("You need a 6 to play....");

                    case 3 -> {
                        position += 21;
                        System.out.println("You climbed the ladder :  21 steps up!!!");
                    }
                    case 6 -> {
                        position += 10;
                        System.out.println("You climbed the ladder :  10 steps up!!!");
                    }
                    case 14 -> {
                        position += 18;
                        System.out.println("You climbed the ladder :  18 steps up!!!");
                    }
                    case 27 -> {
                        position += 29;
                        System.out.println("You climbed the ladder :  14 steps up!!!");
                    }
                    case 39 -> {
                        position += 5;
                        System.out.println("You climbed the ladder :  5 steps up!!!");
                    }
                    case 41 -> {
                        position += 44;
                        System.out.println("You climbed the ladder :  44 steps up!!!");
                    }
                    case 69 -> {
                        position += 19;
                        System.out.println("You climbed the ladder :  18 steps up!!!");
                    }
                    case 79 -> {
                        position += 19;
                        System.out.println("You climbed the ladder :  19 steps up!!!");
                    }
                    case 89 -> {
                        position += 3;
                        System.out.println("You climbed the ladder :  3 steps up!!!");
                    }

                                              //Snakes
                    case 15 -> {
                        position -= 6;
                        System.out.println("You have been chowed :  6 steps down!!!" );
                    }
                    case 42 -> {
                        position -= 25;
                        System.out.println("You have been chowed :  25 steps down!!!");
                    }
                    case 49 -> {
                        position -= 36;
                        System.out.println("You have been chowed :  36 steps down!!!" );
                    }

                    case 58 -> {
                        position -= 13;
                        System.out.println("You have been chowed :  13 steps down!!!" );
                    }
                    case 61 -> {
                        position -= 39;
                        System.out.println("You have been chowed :  39 steps down!!!" );
                    }
                    case 75 -> {
                        position -= 28;
                        System.out.println("You have been chowed :  28 steps down!!!" );
                    }
                    case 88 -> {
                        position -= 51;
                        System.out.println("You have been chowed :  51 steps down!!!" );
                    }
                    case 94 -> {
                        position -= 30;
                        System.out.println("You have been chowed :  30 steps down!!!" );
                    }
                    case 97 -> {
                        position -= 32;
                        System.out.println("You have been chowed :  32 steps down!!!" );
                    }
                    case 100 -> {

                        System.out.println("You have won the game!!!!!");

                    }
                }
            }
            else if(position > 99){
                int extra = position%100;
               position =  position-extra;
                System.out.println("You are now at position : " + position);
                return position;
            }


        System.out.println("You now at:  " + position);

        return finalRolled;
    }


//    / else if(){
//            System.out.println("roll again");
//        }


}

