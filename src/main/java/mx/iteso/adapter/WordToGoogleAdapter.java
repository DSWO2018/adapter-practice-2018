package mx.iteso.adapter;

import mx.iteso.adapter.support.BackgroundImage;
import mx.iteso.adapter.support.Font;

/**WordToGoogleAdapter Class.*/
public class WordToGoogleAdapter implements IGoogleDoc {
    /**var iWordDocument.*/
    private IWordDocument iWordDocument;
    /**var font.*/
    private Font font;
    /**var sharingPermission.*/
    private int sharingPermissions;

    /**Constructor.
     * @param pIWordDocument .*/
    public WordToGoogleAdapter(final IWordDocument pIWordDocument) {
        this.iWordDocument = pIWordDocument;
        this.iWordDocument.setMSOfficeVersion(1);
        this.font = new Font();
        sharingPermissions = 1;

    }
    /**function getFont.
     * @return Font*/
    public final Font getFont() {
        Object[] arr = (Object[]) iWordDocument.getFormat();
        return (Font) arr[1];
    }
    /**function getStyle.
     * @return Object*/
    public final Object getStyle() {
        Object[] arr = (Object[]) iWordDocument.getFormat();
        return arr[0];
    }
    /**function getBackground.
     * @return BackgroundImage*/
    public final BackgroundImage getBackground() {
        return new BackgroundImage(iWordDocument.getBackground());
    }
    /**function setSharingPermissions.
     * @param pSharingPermissions .*/
    public final void setSharingPermissions(final int pSharingPermissions) {
        this.sharingPermissions = pSharingPermissions;
    }
}
