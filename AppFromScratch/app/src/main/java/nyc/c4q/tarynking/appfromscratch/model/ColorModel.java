package nyc.c4q.tarynking.appfromscratch.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tarynking on 11/15/16.
 */

public class ColorModel {
    private Display display;
    private List<ColorPalette> colorPalette = new ArrayList<ColorPalette>();

    /**
     * @return The display
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * @param display The display
     */
    public void setDisplay(Display display) {
        this.display = display;
    }

    /**
     * @return The colorPalette
     */
    public List<ColorPalette> getColorPalette() {
        return colorPalette;
    }

    /**
     * @param colorPalette The colorPalette
     */
    public void setColorPalette(List<ColorPalette> colorPalette) {
        this.colorPalette = colorPalette;
    }

}
