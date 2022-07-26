package Tarea2;

import java.util.List;

import static Tarea2.Color.*;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalizer{
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors){
        int diferentColors=0;
        for ( Color colors : mysteryColors) {
            switch (colors) {
                case BLUE:
                    diferentColors ++;
                    break;
                case GREEN:
                    diferentColors ++;
                    break;
                case RED:
                    diferentColors ++;
                    break;
            }
        }
        return diferentColors;
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int specificColor = 0;
        for ( Color colors : mysteryColors){
            if (color == colors){
                specificColor ++;
            }
        }
        return specificColor ;
    }

}
