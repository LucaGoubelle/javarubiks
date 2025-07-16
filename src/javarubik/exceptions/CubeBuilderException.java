package javarubik.exceptions;

public class CubeBuilderException extends Exception {
    public CubeBuilderException(){
        super("ERR: Invalid size parametter, must be an integer...");
    }
}
