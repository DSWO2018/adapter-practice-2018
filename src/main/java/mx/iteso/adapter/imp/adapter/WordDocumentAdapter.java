package mx.iteso.adapter.imp.adapter;

import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.googledoc.BackgroundImage;
import mx.iteso.adapter.beans.googledoc.Font;

/**
 * Created by Palaf on 08/11/2018.
 */
public class WordDocumentAdapter implements IGoogleDoc {


    private IWordDocument wordDocument;


    public IWordDocument getWordDocument() {
        return wordDocument;
    }

    public void setWordDocument(IWordDocument wordDocumentV) {
        this.wordDocument = wordDocumentV;
    }

    public WordDocumentAdapter(IWordDocument wordDocument) {
        setWordDocument(wordDocument);
    }

    public Font getFont() {
        return (Font)  getWordDocument().getFormat();
    }

    public Object getStyle() {
        return null;
    }

    public BackgroundImage getBackground() {
        return null;
    }

    public void setSharingPermissions(int SharingPermissions) {

    }
}
