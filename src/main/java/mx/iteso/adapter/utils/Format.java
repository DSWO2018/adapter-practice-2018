package mx.iteso.adapter.utils;

/**
 *
 */
public class Format {
    /**
     *
     */
    private Font font;
    /**
     *
     */
    private String style;

    /**
     * @param fon .
     * @param f .
     */
    public Format(final Font fon, final String f) {
        this.font = fon;
        this.style = f;
    }

    /**
     * @param f .
     */
    public Format(final Font f) {
        this.font = f;
    }

    /**
     * @return .
     */
    public final String getFont() {
        return this.font.getFont();
    }

    /**
     * @return .
     */
    public final Font returnFont() {
        return font;
    }

    /**
     * @param f .
     */
    public final void setFont(final Font f) {
        this.font = f;
    }

    /**
     * @return .
     */
    public final String getStyle() {
        return this.style;
    }

}
