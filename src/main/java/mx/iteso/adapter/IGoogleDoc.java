package mx.iteso.adapter;


import mx.iteso.adapter.impl.BackgroundImage;
import mx.iteso.adapter.impl.Font;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}

