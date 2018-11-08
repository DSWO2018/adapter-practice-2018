package mx.iteso.adapter;


import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Image;

public class GoogleToDoc implements IWordDocument {
    private IGoogleDoc google;
    private float msVersion;
    private MSLicense msLicense;

    public GoogleToDoc(IGoogleDoc g) {
        this.google = g;
        this.msLicense = new MSLicense("Google's Adapter License");
    }


    public Object getFormat() {
        return google.getFont();
    }

    public Image getBackground() {
        BackgroundImage bi = google.getBackground();
        return new Image(bi.getImage());
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        this.msVersion = msOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLic) {
        if (this.msLicense.getLicense() == msLic.getLicense()) {
            return true;
        } else {
            return false;
        }

    }
}
