package mx.iteso.adapter;


import mx.iteso.utils.BackgroundImage;
import mx.iteso.utils.Font;

public interface IGoogleDoc {
    public Font getFont();
    public Object getStyle();
    public BackgroundImage getBackground();
    public void setSharingPermissions(int SharingPermissions);
}
