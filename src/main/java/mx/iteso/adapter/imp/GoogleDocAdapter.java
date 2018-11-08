package mx.iteso.adapter.imp;

import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.Image;
import mx.iteso.adapter.beans.MSLicense;

/**
 * Created by Palaf on 08/11/2018.
 */
public class GoogleDocAdapter implements IWordDocument {

    IGoogleDoc googleDoc;

    public GoogleDocAdapter(IGoogleDoc googleDoc) {
        this.googleDoc = googleDoc;
    }

    public Object getFormat() {
        return null;
    }

    public Image getBackground() {
        return null;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {

    }

    public MSLicense getLicense() {
        return null;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return false;
    }
}
