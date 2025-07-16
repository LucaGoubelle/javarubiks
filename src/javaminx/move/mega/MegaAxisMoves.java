package javaminx.move.mega;

import javaminx.data.models.Megaminx;

public class MegaAxisMoves {
    public Megaminx moveY(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveYPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveY(minx);
        return minx;
    }

    public Megaminx moveZ(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveZPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveZ(minx);
        return minx;
    }

    public Megaminx moveXL(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveXLPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveXL(minx);
        return minx;
    }

    public Megaminx moveXR(Megaminx minx){
        //todo: implement this
        return minx;
    }

    public Megaminx moveXRPrime(Megaminx minx){
        for(int i=0;i<4;i++)
            minx = this.moveXR(minx);
        return minx;
    }

}
