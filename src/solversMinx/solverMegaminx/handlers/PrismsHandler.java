package solversMinx.solverMegaminx.handlers;

import javaminx.data.models.Megaminx;
import solversMinx.solverMegaminx.handlers.prisms.*;

public class PrismsHandler {
    private final MagentaPrismHandler magentaPrismHandler;
    private final LimePrismHandler limePrismHandler;
    private final BeigePrismHandler beigePrismHandler;
    private final OrangePrismHandler orangePrismHandler;
    private final CyanPrismHandler cyanPrismHandler;

    public PrismsHandler(){
        this.magentaPrismHandler = new MagentaPrismHandler();
        this.limePrismHandler = new LimePrismHandler();
        this.beigePrismHandler = new BeigePrismHandler();
        this.orangePrismHandler = new OrangePrismHandler();
        this.cyanPrismHandler = new CyanPrismHandler();
    }

    public Megaminx handle(Megaminx minx){
        minx = this.magentaPrismHandler.handle(minx);
        minx = this.limePrismHandler.handle(minx);
        minx = this.beigePrismHandler.handle(minx);
        minx = this.orangePrismHandler.handle(minx);
        minx = this.cyanPrismHandler.handle(minx);
        return minx;
    }

}
