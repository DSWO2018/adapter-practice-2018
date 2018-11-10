package mx.iteso.adapter;

/**
 * Adapter.
 */
public abstract class GoogleDocWordAdapter implements IWordDocument {
    /**
     * GoogleDoc.
     */
    private IGoogleDoc iGoogleDoc;
    /**
     * Background.
     */
    private BackgroindI backgroundI;
    /**
     * Licence.
     */
    private MSLicense msLicense;
    /**
     * Version.
     */
    private float msVer;

    /**
     * Adapter.
     * @param googleDoc s.
     */
    public GoogleDocWordAdapter(final IGoogleDoc googleDoc) {
       this.iGoogleDoc = googleDoc;
       this.msLicense = new MSLicense();
    }
    /**
     * Get format.
     * @return font.
     */
    public Object getFormat() {
        return iGoogleDoc.getFont();
    }

    /**
     * Background image.
     * @return image.
     */
    public BackgroindI getBackgroundi() {
        return this.backgroundI;
    }

    /**
     * Version.
     * @param msOfficeVersion number.
     */
    public void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVer = msOfficeVersion;
    }

    /**
     * Licence.
     * @return licence.
     */
    public MSLicense getLicense() {
        return this.msLicense;
    }

    /**
     * Licence veryfy.
     * @param msLicense licence.
     * @return err if vencido.
     */
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        if (this.msLicense.getLicense() == msLicense.getLicense()) {
            return true;
        } else {
            return false;
        }
    }
}
