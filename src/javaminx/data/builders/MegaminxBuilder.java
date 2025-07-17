package javaminx.data.builders;

import javaminx.data.models.Megaminx;
import javaminx.data.models.Minx;
import javaminx.exceptions.MinxBuilderException;

public class MegaminxBuilder extends MinxBuilder {

    private String[][] createFaceMegaminx(String elem){
        return new String[][] {
                {
                    elem, elem, elem, elem, elem,
                    elem, elem, elem, elem, elem
                },
                {elem}
        };
    }

    @Override
    public Minx build() throws MinxBuilderException {
        try {
            return new Megaminx(
                    this.createFaceMegaminx("grey"),
                    this.createFaceMegaminx("magenta"),
                    this.createFaceMegaminx("lime"),
                    this.createFaceMegaminx("beige"),
                    this.createFaceMegaminx("blue"),
                    this.createFaceMegaminx("red"),
                    this.createFaceMegaminx("orange"),
                    this.createFaceMegaminx("cyan"),
                    this.createFaceMegaminx("yellow"),
                    this.createFaceMegaminx("green"),
                    this.createFaceMegaminx("purple"),
                    this.createFaceMegaminx("white")
            );
        } catch(Exception exc){
            throw new MinxBuilderException();
        }
    }
}
