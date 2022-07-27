package src.Tarea3;

import java.util.ArrayList;

public class Canvas {
    ArrayList <String> x;
    ArrayList <String> y;
    int width,height;
    int [] estructura;
    public Canvas(int width, int height) {
      this.height = height;
      this.width = width;
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        String horizontallines = "-";
        String verticallines = "|" ;
        String i ="\n|" + " ".repeat(width) + "|" ;
        return horizontallines.repeat(width + 2) + i.repeat(height) +"\n"+ horizontallines.repeat(width + 2);
    }
}