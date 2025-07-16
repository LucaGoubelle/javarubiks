package javaminx.data.builders;

import javaminx.data.models.Kilominx;
import javaminx.data.models.Minx;
import javaminx.exceptions.MinxBuilderException;

public class KilominxBuilder extends MinxBuilder {
    private String[] createFaceKilominx(String elem){
        return new String[]{ elem, elem, elem, elem, elem };
    }

    @Override
    public Minx build() throws MinxBuilderException {
        try{
            return new Kilominx(
                    this.createFaceKilominx("grey"),
                    this.createFaceKilominx("magenta"),
                    this.createFaceKilominx("lime"),
                    this.createFaceKilominx("beige"),
                    this.createFaceKilominx("blue"),
                    this.createFaceKilominx("red"),
                    this.createFaceKilominx("orange"),
                    this.createFaceKilominx("cyan"),
                    this.createFaceKilominx("yellow"),
                    this.createFaceKilominx("green"),
                    this.createFaceKilominx("purple"),
                    this.createFaceKilominx("white")
            );
        } catch(Exception exc){
            throw new MinxBuilderException();
        }

    }
}
