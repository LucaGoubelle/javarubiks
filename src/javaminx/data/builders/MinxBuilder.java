package javaminx.data.builders;

import javaminx.data.models.Minx;
import javaminx.exceptions.MinxBuilderException;

public abstract class MinxBuilder {
    // generalisation of builder
    public abstract Minx build() throws MinxBuilderException;

}
