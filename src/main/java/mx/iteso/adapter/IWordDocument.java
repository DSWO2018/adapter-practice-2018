package mx.iteso.adapter;

import java.awt.*;

/**
 * .
 */
public interface IWordDocument {
    /**
     *.
     * @return
     */
    public Object getFormat();

    /**
     * .
     * @return
     */
    public Image getBackground();

    /**
     * .
     * @param msOfficeVersion jhjhjh.
     */
    public void setMSOfficeVersion(float msOfficeVersion);

    /**
     * .
     * @return
     */
    public MSLicense getLicense();

    /**
     * .
     * @param msLicense
     * @return
     */
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
