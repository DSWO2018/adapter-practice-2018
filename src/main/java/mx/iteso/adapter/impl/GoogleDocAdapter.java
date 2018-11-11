package mx.iteso.adapter.impl;


import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.utils.BackgroundImage;
import mx.iteso.adapter.utils.Format;
import mx.iteso.adapter.utils.Image;

/**
 *
 */
public class GoogleDocAdapter implements IWordDocument {
    /***/
    private IGoogleDoc googleDoc;
    /***/
    private MSLicense msl;
    /***/
    private float msVersion;

    /**
     * @param googleDoc1 .
     */
    public GoogleDocAdapter(final IGoogleDoc googleDoc1) {
        this.googleDoc = googleDoc1;
        this.msl = new MSLicense("Google MSLicense");

    }

    /**
     * @return .
     */
    public final Format getFormat() {
        Format f = new Format(googleDoc.getFont());
        return f;
    }

    /**
     * @return .
     */
    public final Image getBackground() {
        BackgroundImage backgroundImage = googleDoc.getBackground();
        return new Image(backgroundImage.getBackground());
    }

    /**
     * @param msOfficeVersion .
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    /**
     * @return .
     */
    public final float getMSOfficeVersion() {
        return this.msVersion;
    }

    /**
     * @return .
     */
    public final MSLicense getLicense() {
        return this.msl;
    }

    /**
     * @param ms .
     * @return .
     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense ms) {
            return this.msl.getLicense() == ms.getLicense();

    }
}
