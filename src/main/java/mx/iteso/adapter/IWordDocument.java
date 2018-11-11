package mx.iteso.adapter;

/**
 * iword.
 */
public interface IWordDocument {
    /**
     * get format.
     * @return     */
   Object getFormat();

    /**
     * get back.
     * @return     */
   Image getBackground();

    /**
     * set off.
     * @param msOfficeVersion     */
   void setMSOfficeVersion(float msOfficeVersion);

    /**
     * get license.
     * @return     */
   MSLicense getLicense();

    /**
     * restricr.
     * @param msLicense .
     * @return     */
   boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
