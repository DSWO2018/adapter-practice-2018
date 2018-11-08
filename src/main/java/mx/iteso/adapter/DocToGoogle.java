package mx.iteso.adapter;

import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Font;
import mx.iteso.utils.Format;

public class DocToGoogle implements IGoogleDoc {

    private IWordDocument word;
    private Format f;
    private int sharingPermissions;

    public DocToGoogle(IWordDocument w) {
        this.word = w;
        f = (Format) word.getFormat();
        this.sharingPermissions = 777;
    }

    public Font getFont() {
        return f.getFont();
    }

    public Object getStyle() {
        return f.getStyle();
    }

    public BackgroundImage getBackground() {
        return new BackgroundImage(word.getBackground().getImage());
    }

    public void setSharingPermissions(int sharingP) {
        this.sharingPermissions = sharingP;
    }
}
