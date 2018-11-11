package mx.iteso.adapter;

import mx.iteso.adapter.utils.Image;

/**
 *
 */
public interface IWordDocument {
    /**
     * @return .
     */
     Object getFormat();

    /**
     * @return .
     */
     Image getBackground();

    /**
     * @param msOfficeVersion .
     */
     void setMSOfficeVersion(float msOfficeVersion);

    /**
     * @return .
     */
     MSLicense getLicense();

    /**
     * @param msLicense .
     * @return .
     */
     boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
