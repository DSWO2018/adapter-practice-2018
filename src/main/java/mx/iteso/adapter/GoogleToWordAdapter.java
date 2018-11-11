package mx.iteso.adapter;

import mx.iteso.adapter.support.Image;
import mx.iteso.adapter.support.MSLicense;

/**GoogleToWordAdapter Class.*/
public class GoogleToWordAdapter implements IWordDocument {
    /**var googleDoc.*/
    private IGoogleDoc googleDoc;
    /**var msLicense.*/
    private MSLicense msLicense = new MSLicense();
    /**var msOfficeVersion.*/
    private float msOfficeVersion = 0;

    /**Constructor.
     * @param pGoogleDoc .*/
    public GoogleToWordAdapter(final IGoogleDoc pGoogleDoc) {
        this.googleDoc = pGoogleDoc;
        this.googleDoc.setSharingPermissions(1);
    }

    /**function getFormat.
     * @return Object*/
    public final Object getFormat() {
        return new Object[]{googleDoc.getStyle(), googleDoc.getFont()};
    }
    /**function getBackground.
     * @return Image*/
    public final Image getBackground() {
      return googleDoc.getBackground().getImage();
    }
    /**function setMSOfficeVersion.
     * @param pMsOfficeVersion .*/
    public final void setMSOfficeVersion(final float pMsOfficeVersion) {
        this.msOfficeVersion = pMsOfficeVersion;
    }
    /**function getLicense.
     * @return MSLicense*/
    public final MSLicense getLicense() {
        return msLicense;
    }
    /**function restrictEditIfLicenseIsInvalid.
     * @param pMsLicense .
     * @return boolean*/
    public final boolean
    restrictEditIfLicenseIsInvalid(final MSLicense pMsLicense) {
        this.msLicense = pMsLicense;
        return true;
    }
}
