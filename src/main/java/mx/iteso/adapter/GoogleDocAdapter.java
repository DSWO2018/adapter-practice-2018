package mx.iteso.adapter;


import mx.iteso.adapter.impl.Image;

public class GoogleDocAdapter implements IWordDocument {
    IGoogleDoc googleDoc;

    public GoogleDocAdapter(IGoogleDoc googleDoc1){
        this.googleDoc = googleDoc1;
    }
    public Object getFormat() {
        googleDoc.getFont();
        googleDoc.getStyle();
        return null;
    }

    public Image getBackground() {
        googleDoc.getBackground();
        return null;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        googleDoc.setSharingPermissions(2);
    }

    public MSLicense getLicense() {

        return null;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        return false;
    }
}
