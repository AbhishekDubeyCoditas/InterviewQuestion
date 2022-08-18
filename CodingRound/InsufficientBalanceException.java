package CodingRound;

import java.util.stream.Stream;

public class InsufficientBalanceException extends  Exception{

    InsufficientBalanceException(String message){
        System.out.println("Insufficient Balance in your account ->>>" + message);
    }
}
