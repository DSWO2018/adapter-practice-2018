package mx.iteso.adapter;

/**
 * google to word.
 */
public class GoogleToWordAdapter implements IWordDocument {
    /**
     * GOOGLE.
     */
    private IGoogleDoc google;
    /**
     * backimage.
     */
    private BackgroundImage backIm;
    /**
     * msllicense.
     */
    private MSLicense msLicense;
    /**
     * ms version.
     */
    private float msVersion;

    /**construcy.
     *
     * @param gDoc     */
    public GoogleToWordAdapter(final IGoogleDoc gDoc) {
        this.google = gDoc;
        this.msLicense = new MSLicense();
    }

    /**
     * get format.
     * @return     */
    public final Object getFormat() {
        return google.getFont();

    }

    /**
     * BACKGROUND.
     * @return     */
    public final BackgroundImage getBackground() {
        return this.backIm;
    }

    /**
     * SET VERSION.
     * @param versionMs     */
    public final void setMSOfficeVersion(final float versionMs) {
        this.msVersion = versionMs;
    }

    /**
     * get lisces.
     * @return     */
    public final MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * restrict.
     * @param msLic .
     * @return     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense msLic) {
        if (this.msLicense.getLs() == msLic.getLs()) {
            return true;
        } else {
            return false;
        }

    }
}
