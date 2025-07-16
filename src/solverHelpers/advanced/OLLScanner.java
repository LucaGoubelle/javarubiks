package solverHelpers.advanced;

import javarubik.data.Cube;
import solverHelpers.CrownCaster;
import solverHelpers.CrownScanner;

import java.util.List;

public class OLLScanner {

    private final CrownScanner scanner;
    private final CrownCaster caster;

    public OLLScanner(){
        this.scanner = new CrownScanner();
        this.caster = new CrownCaster();
    }

    /**
     * Scan the OLL (Orienting Last Layer) config,
     * return a string of bits based on yellow color or not
     * @author: LucaGoubelle
     * */
    public String scanOLL(Cube cube){
        List<List<String>> crown = this.scanner.scanCrown(cube);
        return this.caster.cast(crown);
    }
}
