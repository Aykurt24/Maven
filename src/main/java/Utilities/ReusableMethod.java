package Utilities;

import java.util.Random;

public class ReusableMethod {

    public int RandomNumber(int max){

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max-1)+1;

        return randomNumber;
    }
}
