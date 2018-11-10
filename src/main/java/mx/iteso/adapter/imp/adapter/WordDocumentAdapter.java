package mx.iteso.adapter.imp.adapter;

import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.googledoc.BackgroundImage;
import mx.iteso.adapter.beans.googledoc.Font;
import mx.iteso.adapter.beans.worddoc.Format;

/**
 * Created by Palaf on 08/11/2018.
 */
public class WordDocumentAdapter implements IGoogleDoc {


    private IWordDocument wordDocument;
    private Font font;
    private BackgroundImage backgroundImage;
    private int sharingPermisions;


    public void setFont(Font font) {
        this.font = font;
    }

    public void setBackgroundImage(BackgroundImage backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public int getSharingPermisions() {
        return sharingPermisions;
    }

    public IWordDocument getWordDocument() {
        return wordDocument;
    }

    public void setWordDocument(IWordDocument wordDocumentV) {
        this.wordDocument = wordDocumentV;
    }

    public WordDocumentAdapter(IWordDocument wordDocument) {
        setWordDocument(wordDocument);
        setFont(new Font());
        Format format = (Format) wordDocument.getFormat();
        getFont().setSize(format.getSize());
        getFont().setStyle(format.getStyle());
        setBackgroundImage(new BackgroundImage());
        getBackground().setPath(wordDocument.getBackground().getPath());
    }

    public Font getFont() {
        return this.font;
    }

    public Object getStyle() {
        return getFont().getStyle();
    }

    public BackgroundImage getBackground() {
        return this.backgroundImage;
    }

    public void setSharingPermissions(int SharingPermissions) {
        this.sharingPermisions= SharingPermissions;
    }
}
