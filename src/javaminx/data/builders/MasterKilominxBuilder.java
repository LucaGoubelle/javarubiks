package javaminx.data.builders;

import javaminx.data.models.MasterKilominx;
import javaminx.data.models.Minx;
import javaminx.exceptions.MinxBuilderException;

public class MasterKilominxBuilder extends MinxBuilder {

    @Override
    public Minx build() throws MinxBuilderException {
        try {
            return new MasterKilominx(
                    this.createFaceMasterKilominx("grey"),
                    this.createFaceMasterKilominx("magenta"),
                    this.createFaceMasterKilominx("lime"),
                    this.createFaceMasterKilominx("beige"),
                    this.createFaceMasterKilominx("blue"),
                    this.createFaceMasterKilominx("red"),
                    this.createFaceMasterKilominx("orange"),
                    this.createFaceMasterKilominx("cyan"),
                    this.createFaceMasterKilominx("yellow"),
                    this.createFaceMasterKilominx("green"),
                    this.createFaceMasterKilominx("purple"),
                    this.createFaceMasterKilominx("white")
            );
        } catch(Exception exc){
            throw new MinxBuilderException();
        }
    }

    private String[][] createFaceMasterKilominx(String elem) {
        return new String[][]{
                {
                        elem, elem, elem, elem, elem,
                        elem, elem, elem, elem, elem,
                        elem, elem, elem, elem, elem
                },
                {
                    elem, elem, elem, elem, elem
                }
        };
    }
}
