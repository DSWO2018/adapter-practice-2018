package mx.iteso.adapter;

import javafx.scene.layout.BackgroundImage;

import java.awt.*;

/**
 * Google doc interface.
 */
public interface IGoogleDoc {
    /**
     * Font.
     * @return Font.
     */
    public Font getFont();

    /**
     * Style.
     * @return ogj.
      */
    public Object getStyle();

    /**
     * background.
     * @return BK.
     */
    public BackgroundImage getBackground();

    /**
     * Share.
     * @param SharingPermissions perms
     */
    public void setSharingPermissions(int SharingPermissions);
}

