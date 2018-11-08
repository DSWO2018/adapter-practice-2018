package mx.iteso.adapter.imp;
import mx.iteso.adapter.*;
import mx.iteso.adapter.beans.BackgroundImage;
import mx.iteso.adapter.beans.Font;

/**
 * Created by Palaf on 08/11/2018.
 */
public class WordDocumentAdapter implements IGoogleDoc {

    public IWordDocument getWordDocument() {
        return wordDocument;
    }

    public void setWordDocument(IWordDocument wordDocumentV) {
        this.wordDocument = wordDocumentV;
    }

    private IWordDocument wordDocument;

    public WordDocumentAdapter(IWordDocument wordDocument) {
        setWordDocument(wordDocument);
    }

    public Font getFont() {
        return null;
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
