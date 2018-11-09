package mx.iteso.adapter;

public class GoogleToWordAdapter implements IWordDocument{

    private IGoogleDoc google;
    private BackgroundImage backIm;
    private MSLicense msLicense;
    private float msVersion;


    public GoogleToWordAdapter(IGoogleDoc gDoc) {
        this.google = gDoc;
        this.msLicense = new MSLicense();
    }


    public Object getFormat() {
        return google.getFont();

    }

    public BackgroundImage getBackground() {
        return this.backIm;
    }

    public void setMSOfficeVersion(float versionMs) {
        this.msVersion = versionMs;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLic) {
        if (this.msLicense.getLs() == msLic.getLs()) {
            return true;
        } else {
            return false;
        }

    }
}
