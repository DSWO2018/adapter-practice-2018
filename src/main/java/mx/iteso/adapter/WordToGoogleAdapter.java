package mx.iteso.adapter;

/**
 * word to doc.
 */
public abstract class WordToGoogleAdapter implements IGoogleDoc {
    /**
     * word.
     */
    private IWordDocument word;
    /**
     * format.
     */
    private Format f;
    /**
     * fo.
     */
    private Font fo;
   // private Object st;
    /**
     * permisos.
     */
    private boolean sharingPermissions;

    /**
     * constructor.
     * @param w     */
    public WordToGoogleAdapter(final IWordDocument w) {
        this.word = w;
        f = (Format) word.getFormat();
        fo = (Font) w.getFormat();
        this.sharingPermissions = true;
    }

    /**
     * font.
     * @return     */
    public final Font getFont() {
        return fo;
    }

    /**
     * get style.
     * @return     */
    public final Object getStyle() {
        return f;
    }

    /**
     * permisos.
     * @param sP     */
    public final void setSharingPermissions(final boolean sP) {
        this.sharingPermissions = sP;
    }
}

