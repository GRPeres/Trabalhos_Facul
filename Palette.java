import java.awt.Color;

public class Palette {
    
    private String name;

    // TODO: Implemente como ENUM ou como Classe
    private Harmony type;

    // TODO: use alguma classe já existente no Java
    private Color mainColor;
    
    // TODO: implemente o construtor
    public Palette(String n, Harmony t, Color c) {
        this.name = n;
        this.type = t;
        this.mainColor = c;
    }

    public Color[] Return_Palette() {
        
        switch(type) {

            case Monocromatica:

                Color s;
                Color t;

                s = new Color(mainColor.getRed(), mainColor.getGreen(),mainColor.getBlue(), mainColor.getAlpha()-80);
                t = new Color(mainColor.getRed(, mainColor.getGreen(),mainColor.getBlue(), mainColor.getAlpha()-160);

                Color[] Mono = {mainColor,s,t};
                return Mono;
        
            case Triangular:

                Color s1;
                Color t1;

                s1 = new Color(mainColor.getBlue(),mainColor.getRed(),mainColor.getGreen(), mainColor.getAlpha());
                t1 = new Color(mainColor.getGreen(),mainColor.getBlue(),mainColor.getRed(), mainColor.getAlpha());

                Color[] Mono1 = {mainColor,s1,t1};
                return Mono1;

            case Quadratica:

                Color s2;
                Color t2;

                s2 = new Color(Math.round(mainColor.getRed()*.5),Math.round(mainColor.getBlue()*.5), mainColor.getGreen(), mainColor.getAlpha()-80);
                t2 = new Color(mainColor.getRed(),Math.round(mainColor.getBlue()*.5), Math.round(mainColor.getGreen()*.5), mainColor.getAlpha()-160);

                Color[] Mono2 = {mainColor,s2,t2};
                return Mono2;

            default:

                Color[] Def = {mainColor};
                return Def;
        }
    }
}
