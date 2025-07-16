package javaminxIHM.helpers;

import java.awt.*;
import java.util.HashMap;

public class StickerDrawer {

    private HashMap<String, Color> hmapColor;

    public StickerDrawer(){
        this.hmapColor = new HashMap<>();
        this.hmapColor.put("white", Color.WHITE);

        this.hmapColor.put("red", Color.RED);
        this.hmapColor.put("blue", Color.BLUE);
        this.hmapColor.put("green", new Color(0,130,0));
        this.hmapColor.put("purple", new Color(150,30,150));
        this.hmapColor.put("yellow", Color.YELLOW);

        this.hmapColor.put("cyan", Color.CYAN);
        this.hmapColor.put("orange", Color.ORANGE);
        this.hmapColor.put("magenta", Color.MAGENTA);
        this.hmapColor.put("beige", new Color(255,255,190));
        this.hmapColor.put("lime", new Color(0,255,0));

        this.hmapColor.put("grey", new Color(166,166,166));
    }

    public void drawSticker(Graphics2D g2, Polygon p, String color){
        g2.setColor(this.hmapColor.getOrDefault(color, new Color(32,32,32)));
        g2.fill(p);
        g2.setColor(Color.BLACK);
        g2.draw(p);
    }
}
