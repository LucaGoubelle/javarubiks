package javaminx.move.mega;

import javaminx.data.models.Megaminx;

public class MegaULRFMoves {
    public Megaminx moveU(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveUPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveU(minx);
        return minx;
    }

    public Megaminx moveU2(Megaminx minx){
        for(int i=0;i<2;i++)
            minx = this.moveU(minx);
        return minx;
    }

    public Megaminx moveL(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveLPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveL(minx);
        return minx;
    }

    public Megaminx moveL2(Megaminx minx){
        for(int i=0;i<2;i++)
            minx = this.moveL(minx);
        return minx;
    }

    public Megaminx moveR(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveRPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveR(minx);
        return minx;
    }

    public Megaminx moveR2(Megaminx minx){
        for(int i=0;i<2;i++)
            minx = this.moveR(minx);
        return minx;
    }

    public Megaminx moveF(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveFPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveF(minx);
        return minx;
    }

    public Megaminx moveF2(Megaminx minx){
        for(int i=0;i<2;i++)
            minx = this.moveF(minx);
        return minx;
    }
}
