package javarubik.exceptions;

public class CubeMoveException extends Exception {
    public CubeMoveException(){
        super("ERR: invalid parametter cube, mv(s)...");
    }
}
