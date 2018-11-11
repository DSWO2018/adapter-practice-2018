package mx.iteso.adapter.impl;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.IWordDocument;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.utils.Font;
import mx.iteso.adapter.utils.BackgroundImage;
import mx.iteso.adapter.utils.Format;

/**
 *
 */
public class WordDocAdapter implements IGoogleDoc {
    /***/
    private IWordDocument wordDocument;
    /***/
    private MSLicense ms = new MSLicense("Word License");
    /***/
    private Format format;
    /***/
    private Font font;
    /***/
    private String style = "bold";

    /**
     * @param worddoc .
     */
    public WordDocAdapter(final IWordDocument worddoc) {
        this.wordDocument = worddoc;
        font = new Font("Arial");
        format = new Format(font, style);

    }

    /**
     * @return .
     */
    public final Font getFont() {
        return format.returnFont();
    }

    /**
     * @return .
     */
    public final Object getStyle() {
        return format.getStyle();
    }

    /**
     * @return .
     */
    public final BackgroundImage getBackground() {
        return new BackgroundImage(wordDocument.getBackground().getImage());
    }

    /**
     * @param sharingPermissions .
     */
    public final void setSharingPermissions(final int sharingPermissions) {
        wordDocument.setMSOfficeVersion(sharingPermissions);
        wordDocument.getLicense();
        wordDocument.restrictEditIfLicenseIsInvalid(ms);

    }
}
