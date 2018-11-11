package mx.iteso.adapter;

import mx.iteso.adapter.support.BackgroundImage;
import mx.iteso.adapter.support.Font;

/**IGoogleDoc Interface.*/
public interface IGoogleDoc {
    /**function getFont.
     * @return Font.*/
    Font getFont();
    /**function getStyle.
     * @return Object.*/
    Object getStyle();
    /**function getBackground.
     * @return BackgroundImage.*/
    BackgroundImage getBackground();
    /**function setSharingPermissions.
     * @param sharingPermissions .*/
    void setSharingPermissions(int sharingPermissions);
}

