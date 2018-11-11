package mx.iteso.adapter;

import javafx.scene.layout.BackgroundImage;

/**
 * igogle.
 */
public interface IGoogleDoc {
    /**
     * fint.
     * @return     */
    Font getFont();

    /**
     * get stule.
     * @return     */
    Object getStyle();

    /**
     * get back.
     * @return     */
    BackgroundImage getBackground();

    /**
     * sharing.
     * @param sharingPermissions     */
    void setSharingPermissions(int sharingPermissions);
}

