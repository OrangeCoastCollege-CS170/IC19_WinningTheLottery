package edu.orangecoastcollege.sbadajoz.ic19;

import java.util.Random;

public class WinningTheLottery {
    public static void randomlyAssignNumbers(int[]array, Random ran) {       
        for(int i = 0 ; i < array.length; i++) {
            array[i] = ran.nextInt(36) + 1;
        }
    }
    
    public static int howManyCorrect(int[] one, int[] two) {
        int ret = 0;
        if(one.length == two.length)
        for(int i = 0 ; i < one.length; i++) {
            if (one[i] == two[i]) ret++;
        }
        return ret;
    }
    
    public static void main(String[] args) {
        int[] winningNum = new int[5];
        int[] guessedNum = new int[5];
        boolean found = false;
        int counter = 0;
        Random ran = new Random();
        
        randomlyAssignNumbers(winningNum, ran);
        
        System.out.print("The winning lottery numbers are:\n\n");
        for(int i = 0 ; i < winningNum.length; i++) {            
            winningNum[i] = ran.nextInt(36) + 1;
            System.out.print(winningNum[i] + " ");
        }
        
        while(!found){
            randomlyAssignNumbers(guessedNum, ran);
            found = howManyCorrect(winningNum, guessedNum) == 5;
            counter++;
        }
        System.out.println("\n\nAfter spending $" + counter + ".00, you won Fantasy5!  5 out of 5 lottery numbers were correct.  You win $75,000");
    }
}
