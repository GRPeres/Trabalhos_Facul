import java.awt.Color;

public class Main {
    
    public static void main(String[] args) {

        Color mainColor = new Color(124,252,0, 255);

       // TODO: Crie um objeto palette. Um tema baseado no Palette criado.
        Palette Verde_Mono = new Palette("Verde Mono",Harmony.Monocromatica, mainColor);
        Theme Natureza = new Theme("Natureza",Verde_Mono);

       // TODO: Imprima o tema com todas as caracteristicas apresentadas 
       // de forma visualmente agradavel 
       System.out.println(Natureza);

    }
}