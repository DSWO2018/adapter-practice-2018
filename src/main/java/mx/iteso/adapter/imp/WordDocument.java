package mx.iteso.adapter.imp;

import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.worddoc.Format;
import mx.iteso.adapter.beans.worddoc.Image;
import mx.iteso.adapter.beans.worddoc.MSLicense;

/**
 * Created by Palaf on 08/11/2018.
 */
public class WordDocument implements IWordDocument {
    Format format;
    Image image;
    MSLicense msLicense;

    public Object getFormat() {
        return this.format;
    }

    public Image getBackground() {
        return this.image;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        msLicense.setVersion(msOfficeVersion);
    }

    public MSLicense getLicense() {
        return this.getLicense();
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicenseV) {
        if(msLicenseV.getVersion()==getLicense().getVersion()){
            return true;
        }else {
            return false;
        }

    }
}
