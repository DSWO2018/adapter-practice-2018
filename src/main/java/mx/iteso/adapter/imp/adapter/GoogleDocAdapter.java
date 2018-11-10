package mx.iteso.adapter.imp.adapter;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.beans.googledoc.BackgroundImage;
import mx.iteso.adapter.beans.googledoc.Font;
import mx.iteso.adapter.beans.worddoc.Format;
import mx.iteso.adapter.beans.worddoc.Image;
import mx.iteso.adapter.beans.worddoc.MSLicense;

/**
 * Created by Palaf on 08/11/2018.
 */
public class GoogleDocAdapter implements IWordDocument {

    private IGoogleDoc googleDoc;
    private Format format;
    private Image image;
    private float msOfficeVersion;
    private MSLicense msLicense;

    public MSLicense getMsLicense() {
        return msLicense;
    }

    public void setMsLicense(MSLicense msLicense) {
        this.msLicense = msLicense;
    }

    public void setImage(Image imageV) {
        this.image = imageV;
    }

    public void setFormat(Format formatV) {
        this.format = formatV;
    }

    public IGoogleDoc getGoogleDoc() {
        return googleDoc;
    }

    public void setGoogleDoc(IGoogleDoc googleDocV) {
        this.googleDoc = googleDocV;

    }

    public GoogleDocAdapter(IGoogleDoc googleDoc) {
        setGoogleDoc(googleDoc);
        Format format = new Format();
        Font font = googleDoc.getFont();
        format.setSize(font.getSize());
        Object style = googleDoc.getStyle();
        format.setStyle((String) style);
        setFormat(format);
        Image image = new Image();
        BackgroundImage backgroundImage = googleDoc.getBackground();
        String path = backgroundImage.getPath();
        image.setPath(path);
        setImage(image);
        setMsLicense(new MSLicense());
        getMsLicense().setVersion((float) 3.3);
    }

    public Object getFormat() {
        return this.format;
    }

    public Image getBackground()
    {

        return this.image;
    }

    public void setMSOfficeVersion(float msOfficeVersion) {
        this.msOfficeVersion = msOfficeVersion;
    }

    public MSLicense getLicense() {
        return this.msLicense;
    }

    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense) {
        if (getMsLicense().getVersion() == msLicense.getVersion()) {
            return true;
        } else {
            return false;
        }
    }
}
