package mx.iteso.adapter;

import mx.iteso.adapter.support.Image;
import mx.iteso.adapter.support.MSLicense;

/**IWordDocument Interface.*/
public interface IWordDocument {
    /**function getFormat.
     * @return Object.*/
    Object getFormat();
    /**function getBackground.
     * @return Image.*/
    Image getBackground();
    /**function setMSOfficeVersion.
     * @param msOfficeVersion .*/
    void setMSOfficeVersion(float msOfficeVersion);
    /**function getLicense.
     * @return MSLicense*/
    MSLicense getLicense();
    /**function restrictEditIfLicenseIsValid.
     * @param msLicense .
     * @return boolean*/
    boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
