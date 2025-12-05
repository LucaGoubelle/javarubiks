package solversCube.solver3x3CFOP.handlers.F2LHandlers;

import solverHelpers.advanced.F2LScanner;
import solversCube.solver3x3CFOP.cases.F2LCases.*;
import solversCube.solver3x3CFOP.handlers.Handler;

public class F2LHandler extends Handler {

    protected final F2LScanner f2lScanner;
    protected final F2LPairLeftCases f2lPairLeftCases;
    protected final F2LPairRightCases f2lPairRightCases;
    protected final F2LInCases f2lInCases;
    protected final F2LHalfInCases f2lHalfInCases;
    protected final F2LSplitLeftCases f2lSplitLeftCases;
    protected final F2LSplitBackCases f2lSplitBackCases;

    public F2LHandler(){
        this.f2lScanner = new F2LScanner();

        this.f2lPairLeftCases = new F2LPairLeftCases();
        this.f2lPairRightCases = new F2LPairRightCases();
        this.f2lInCases = new F2LInCases();
        this.f2lHalfInCases = new F2LHalfInCases();
        this.f2lSplitLeftCases = new F2LSplitLeftCases();
        this.f2lSplitBackCases = new F2LSplitBackCases();
    }
}
