package mx.iteso.adapter;

import mx.iteso.adapter.beans.BackgroundImage;
import mx.iteso.adapter.beans.Font;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

