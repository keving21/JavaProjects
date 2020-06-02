import java.lang.reflect.Array;
import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static char [][] gameBoard = {{' ', '|',' ','|',' ' },
            {'-', '+','-','+','-' },
            {' ', '|',' ','|',' ' },
            {'-', '+','-','+','-' },
            {' ', '|',' ','|',' ' }};

    public static void main(String[] args) {

        printGameBoard();
        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Position taken! Enter a valid number: ");
                playerPos = scan.nextInt();
            }

            System.out.println(playerPos);
            placePiece(playerPos,"Player");
            String result = checkWinner();
            if (result.length() > 0){
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) +1;
            placePiece(cpuPos, "CPU");
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) +1;
            }
            if (result.length() > 0){
                System.out.println(result);
                break;
            }

        }


    }

    public static void printGameBoard(){
        for(char[] row : gameBoard){
            for (char c: row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(int pos, String user) {

        char symbol = ' ';

        if(user.equals("Player")){
            symbol = 'X';
            playerPositions.add(pos);
        }
        else if(user.equals("CPU")){
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch (pos){
            case 1:
                gameBoard[0][0] = symbol;
                System.out.println("-------------------");
                break;
            case 2:
                gameBoard[0][2] = symbol;
                System.out.println("-------------------");
                break;
            case 3:
                gameBoard[0][4] = symbol;
                System.out.println("-------------------");
                break;
            case 4:
                gameBoard[2][0] = symbol;
                System.out.println("-------------------");
                break;
            case 5:
                gameBoard[2][2] = symbol;
                System.out.println("-------------------");
                break;
            case 6:
                gameBoard[2][4] = symbol;
                System.out.println("-------------------");
                break;
            case 7:
                gameBoard[4][0] = symbol;
                System.out.println("-------------------");
                break;
            case 8:
                gameBoard[4][2] = symbol;
                System.out.println("-------------------");
                break;
            case 9:
                gameBoard[4][4] = symbol;
                System.out.println("-------------------");
                break;
            default:
                break;

        }
        printGameBoard();

    }

    public static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botmRow = Arrays.asList(7,8,9);
        //columns
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);

        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botmRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l: winning){
            if (playerPositions.containsAll(l)){
                return "Congratulations you won!";
            }
            else if(cpuPositions.containsAll(l)){
                return "CPU wins :(";
            }
            else if(playerPositions.size() + cpuPositions.size() ==9){
                return "CAT!";
            }
        }

            return "";

    }


}
