package javarubikIHM.helpers;

import java.awt.*;

public class FaceDrawer {
    private final StickerDrawer stickerDrawer;
    public FaceDrawer(){
        this.stickerDrawer = new StickerDrawer();
    }

    public void drawFrontFace(Graphics2D g2, String[][] face, int x, int y, int size){
        int offset = 2;
        for(int i=0;i<face.length;i++){
            for(int j=0;j<face.length;j++){
                this.stickerDrawer.drawFrontSticker(g2, face[i][j],
                        x+(size*j)+(offset*j),y+(size*i)+(offset*i), size);
            }
        }
    }

    public void drawRightFace(Graphics2D g2, String[][] face, int x, int y, int size){
        int sizeDepth = (int) size / 2;
        int offset = 2;
        int len = face.length;
        for(int i=0;i<len;i++){
            int totalOffsetI = offset*i;
            int totalSizeDepth = sizeDepth*i;
            int allSize = size*len;
            int allOffset = offset*(len+i);
            int xFinal = x+allSize+totalSizeDepth+allOffset;
            for(int j=0;j<len;j++){
                int totalOffsetJ = offset*j;
                int totalSize = size*j;
                int y0 = y+totalSize+totalOffsetJ;
                int yFinal = y0-totalSizeDepth-totalOffsetI;

                this.stickerDrawer.drawRightSticker(g2, face[j][i], xFinal, yFinal, size);
            }
        }
    }
}
