package buoi12;

public class InvalidAgeException extends RuntimeException  {
    private int age;

    public InvalidAgeException(String message){
        super(message);
    }
    public static void checkage(int age){
        age = age;
        if (age < 6){
            throw new InvalidAgeException("Age must be 6 or above!");
        }
    }

}

