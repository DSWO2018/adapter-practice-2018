package mx.iteso.adapter;

import mx.iteso.adapter.utils.Font;
import mx.iteso.adapter.utils.Format;
import mx.iteso.adapter.utils.Image;

/**
 *
 */
public class WordDocument implements IWordDocument {
    /**
     *
     */
    private Font font = new Font("Arial");

    /**
     *
     */
    private Format format = new Format(font, "Bold");

    /**
     * @return .
     */
    public final Format getFormat() {
        return format;
    }

    /**
     * @return .
     */
    public final Image getBackground() {
        return null;
    }

    /**
     * @param msOfficeVersion .
     */
    public final void setMSOfficeVersion(final float msOfficeVersion) {

    }

    /**
     * @return .
     */
    public final MSLicense getLicense() {
        return null;
    }

    /**
     * @param ms .
     * @return .
     */
    public final boolean restrictEditIfLicenseIsInvalid(final MSLicense ms) {
        return false;
    }
}
