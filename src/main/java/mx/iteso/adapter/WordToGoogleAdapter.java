package mx.iteso.adapter;

public abstract class WordToGoogleAdapter implements IGoogleDoc{

    private IWordDocument word;
    private Format f;
    private Font fo;
   // private Object st;
    private boolean sharingPermissions;

    public WordToGoogleAdapter(IWordDocument w) {
        this.word = w;
        f = (Format) word.getFormat();
        fo= (Font)w.getFormat();
        this.sharingPermissions = true;
    }

    public Font getFont() {
        return fo;
    }

    public Object getStyle() {
        return f;
    }

    public void setSharingPermissions(boolean sP) {
        this.sharingPermissions = sP;
    }
}

