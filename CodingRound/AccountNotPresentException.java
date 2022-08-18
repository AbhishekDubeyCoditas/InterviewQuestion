package CodingRound;

import java.util.stream.Stream;

public class AccountNotPresentException extends  Exception{

    AccountNotPresentException(String message){
        System.out.println("Please enter Account number correctly --->" + message);
    }
}
