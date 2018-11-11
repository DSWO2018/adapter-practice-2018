package mx.iteso.adapter;


import mx.iteso.adapter.utils.BackgroundImage;
import mx.iteso.adapter.utils.Font;

/**
 *
 */
public interface IGoogleDoc {
    /**
     * @return .
     */
     Font getFont();

    /**
     * @return .
     */
     Object getStyle();

    /**
     * @return .
     */
     BackgroundImage getBackground();

    /**
     * @param sharingPermissions .
     */
     void setSharingPermissions(int sharingPermissions);
}

