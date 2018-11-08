package mx.iteso.adapter.imp.adapter;

import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.worddoc.Image;
import mx.iteso.adapter.beans.worddoc.MSLicense;

/**
 * Created by Palaf on 08/11/2018.
 */
public class GoogleDocAdapter implements IWordDocument {

   private IGoogleDoc googleDoc;

    public IGoogleDoc getGoogleDoc() {
        return googleDoc;
    }

    public void setGoogleDoc(IGoogleDoc googleDocV) {
        this.googleDoc = googleDocV;
    }

    public GoogleDocAdapter(IGoogleDoc googleDoc) {
        setGoogleDoc(googleDoc);
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
