package javarubikIHM.helpers;

import java.awt.*;
import java.util.HashMap;

public class StickerDrawer {
    private HashMap<String, Color> hmap;

    public StickerDrawer(){
        this.hmap = new HashMap<>();
        this.hmap.put("white", Color.WHITE);
        this.hmap.put("yellow", Color.YELLOW);
        this.hmap.put("blue", Color.BLUE);
        this.hmap.put("red", Color.RED);
        this.hmap.put("green", Color.GREEN);
        this.hmap.put("orange", new Color(255,96,0));
    }
    public void drawFrontSticker(Graphics2D g2, String colstr, int x, int y, int size){
        Color col = this.hmap.getOrDefault(colstr, Color.BLACK);
        Rectangle rect = new Rectangle(x,y,size,size);
        g2.setColor(col);
        g2.fill(rect);
    }

    public void drawUpSticker(Graphics2D g2, String colstr, int x, int y, int size){
        int size_depth = (int) size / 2;
        Color col = this.hmap.getOrDefault(colstr, Color.BLACK);
        int[] xPoints = new int[]{x, x+size, x+size-size_depth, x-size_depth};
        int[] yPoints = new int[]{y, y, y+size_depth, y+size_depth};
        Polygon p = new Polygon(xPoints, yPoints, 4);
        g2.setColor(col);
        g2.fill(p);
    }

    public void drawRightSticker(Graphics2D g2, String colstr, int x, int y, int size){
        int size_depth = (int) size / 2;
        Color col = this.hmap.getOrDefault(colstr, Color.BLACK);
        int[] xPoints = new int[]{x, x+size_depth, x+size_depth, x};
        int[] yPoints = new int[]{y, y-size_depth, y+size-size_depth, y+size};
        Polygon p = new Polygon(xPoints, yPoints, 4);
        g2.setColor(col);
        g2.fill(p);
    }
}
