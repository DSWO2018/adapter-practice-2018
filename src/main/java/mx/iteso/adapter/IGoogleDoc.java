package mx.iteso.adapter;

import mx.iteso.adapter.beans.googledoc.BackgroundImage;
import mx.iteso.adapter.beans.googledoc.Font;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

