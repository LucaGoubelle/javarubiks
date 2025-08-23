package javaminxIHM.components;

import javaminx.data.models.*;
public class MinxComponentFactory {
    private final Minx minx;

    public MinxComponentFactory(Minx minx){
        this.minx = minx;
    }

    public MinxComponent make(String puzzleType){
        return switch (puzzleType) {
            case "kilominx" -> new KilominxComponent((Kilominx) this.minx);
            case "megaminx" -> new MegaminxComponent((Megaminx) this.minx);
            case "masterKilominx" -> new MasterKilominxComponent((MasterKilominx) this.minx);
            default -> new MegaminxComponent((Megaminx) this.minx);
        };
    }
}
