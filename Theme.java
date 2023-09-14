public class Theme {

    private String name;
    private Palette colors;
    private String description;

    public Theme(String n, Palette p) {
        this.name = n;
        this.colors = p;
    }

    public Theme(String n, Palette p, String d) {
        this.name = n;
        this.colors = p;
        this.description = d;
    }

    @Override
    public String toString() {

      return "Theme{name=" + name + ", mainColor=" + colors.Return_Palette()[0] + " + Alpha=" + colors.Return_Palette()[0].getAlpha()
      + ", secondaryColor=" + colors.Return_Palette()[1] + " + Alpha=" + colors.Return_Palette()[1].getAlpha() 
      + ", terciaryColor=" + colors.Return_Palette()[2] + " + Alpha=" + colors.Return_Palette()[2].getAlpha() 
      + ", description=" 
      + description + "}";

    }
    
}
