
public class HaddleException {

    public static void main(String[] args) {
        int x = 21;

        try {
            if (x < 31) {
                throw new InvalidValException();
            }
        } catch (InvalidValException e) {
            System.out.println(e.message);
        }
    }
}

class InvalidValException extends Exception {

    String message;

    public InvalidValException() {
        message = "Need an Integer greater than 30";
    }

}
