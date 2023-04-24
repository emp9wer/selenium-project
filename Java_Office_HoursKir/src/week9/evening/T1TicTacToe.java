package week9.evening;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Arrays;

public class T1TicTacToe {
    public static void main(String[] args) {

//create 2d array
        char[][] gameResult = {

                {'o', 'x', 'x'},//0
                {'x', 'o', 'x'},//1
                {'x', 'o', 'o'} //2
                //0   1   2
        };
//create 2 variables to count x and o
        int numOfxxx = 0;
        int numOfooo = 0;
//create nested loop to iterate 2d array
        for (int i = 0; i < gameResult.length; i++) {
            String container ="";
            for (int j = 0; j < gameResult[i].length; j++) {
                container += ""+gameResult[i][j];
            }
            if(container.equals("xxx")){
                numOfxxx++;
            }
            if(container.equals("ooo")){
                numOfooo++;
            }
        }
        if(numOfxxx>numOfooo){
            System.out.println("x won");
        } else if (numOfxxx<numOfooo) {
            System.out.println("o won");
        }else {
            System.out.println("tie");
        }



//


    }
}
/*
1TicTacToe [multidimensional array]

    Create a program that will define a 2D array for a tic tac toe game. Check the board to see who won.
    X or O are the winners if they have 3 of the same character in a row. If there is not 3 X or O in a row print Tie instead

 */