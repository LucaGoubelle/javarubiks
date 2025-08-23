package javaminxIHM.listeners;

import javaminxIHM.components.MinxComponent;

public class MinxKeyListenerFactory {
    public MinxKeyListener make(String puzzleType, MinxComponent component){
        return switch (puzzleType){
            case "kilominx" -> new KilominxKeyListener(component);
            case "megaminx" -> new MegaminxKeyListener(component);
            case "masterKilominx" -> new MasterKilominxKeyListener(component);
            default -> new KilominxKeyListener(component);
        };
    }
}
