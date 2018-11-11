package mx.iteso.adapter;

import mx.iteso.adapter.utils.BackgroundImage;
import mx.iteso.adapter.utils.Font;

/**
 *
 */
public class GoogleDoc implements IGoogleDoc {
    /**
     * @return .
     */
    public final Font getFont() {
        return new Font("Arial");
    }

    /**
     * @return .
     */
    public final Object getStyle() {
        return null;
    }

    /**
     * @return .
     */
    public final BackgroundImage getBackground() {
        return null;
    }

    /**
     * @param sharingPermissions .
     */
    public final void setSharingPermissions(final int sharingPermissions) {

    }
}
