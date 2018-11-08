package mx.iteso.adapter;

import mx.iteso.adapter.impl.Font;
import mx.iteso.adapter.impl.BackgroundImage;

public class WordDocAdapter implements IGoogleDoc{
    IWordDocument wordDocument;
    MSLicense ms = new MSLicense();

    public WordDocAdapter(IWordDocument worddoc){
        this.wordDocument = worddoc;
    }

    public Font getFont() {
        wordDocument.getFormat();
        return null;
    }

    public Object getStyle() {
        wordDocument.getFormat();
        return null;
    }

    public BackgroundImage getBackground() {
        wordDocument.getBackground();
        return null;
    }

    public void setSharingPermissions(int SharingPermissions) {
        wordDocument.setMSOfficeVersion(3);
        wordDocument.getLicense();
        wordDocument.restrictEditIfLicenseIsInvalid(ms);

    }
}
