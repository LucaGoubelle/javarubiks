package javaminx.data;

import javaminx.data.builders.KilominxBuilder;
import javaminx.data.builders.MasterKilominxBuilder;
import javaminx.data.builders.MegaminxBuilder;
import javaminx.data.models.Minx;
import javaminx.exceptions.MinxBuilderException;

import java.util.HashMap;

public class MinxFactory {
    private final KilominxBuilder KilominxBuilder;
    private final MegaminxBuilder megaminxBuilder;
    private final MasterKilominxBuilder mkBuilder;
    private HashMap<String, Minx> hmapPuzzle;

    public MinxFactory() throws MinxBuilderException {
        this.KilominxBuilder = new KilominxBuilder();
        this.megaminxBuilder = new MegaminxBuilder();
        this.mkBuilder = new MasterKilominxBuilder();
        
        this.hmapPuzzle = new HashMap<>();
        this.hmapPuzzle.put("kilominx", this.KilominxBuilder.build());
        this.hmapPuzzle.put("megaminx", this.megaminxBuilder.build());
        this.hmapPuzzle.put("masterKilominx", this.mkBuilder.build());
    }

    /**
    * return a specific minx builder instance based on the puzzleType argument
    * @author: LucaGoubelle
    */
    public Minx make(String puzzleType) throws MinxBuilderException {
        return this.hmapPuzzle.getOrDefault(puzzleType, this.megaminxBuilder.build());
    }
}
