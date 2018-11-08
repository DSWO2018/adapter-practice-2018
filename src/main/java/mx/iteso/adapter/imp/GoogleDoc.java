package mx.iteso.adapter.imp;

import mx.iteso.adapter.IGoogleDoc;
import mx.iteso.adapter.beans.googledoc.BackgroundImage;
import mx.iteso.adapter.beans.googledoc.Font;

/**
 * Created by Palaf on 08/11/2018.
 */
public class GoogleDoc implements IGoogleDoc {
    Font font;
    BackgroundImage backgroundImage;
    int SharingPermissions;

    public
    void setBackgroundImage(BackgroundImage backgroundImageV) {
        this.backgroundImage = backgroundImageV;
    }


    public void setFont(Font fontV) {
        this.font = fontV;
    }


    public void setSharingPermissions(int SharingPermissionsV) {
        this.SharingPermissions = SharingPermissionsV;
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

    public int getSharingPermissions() {
        return this.SharingPermissions;
    }
}
