package javarubik.exceptions;

public class CubePrinterException extends Exception{
    public CubePrinterException(){
        super("ERR: Invalid Cube parametter, must be a cube object...");
    }
}
