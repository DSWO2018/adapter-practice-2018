package mx.iteso.adapter;


/**
 * Clase adapter.
 */
public abstract class WordDocGoogleAdapter implements IGoogleDoc {
    /**
     * Documento word.
     */
    private IWordDocument wordDocument;
    /**
     * Formato.
     */
    private Format format;
    /**
     * Fuente.
     */
    private Font font;
    /**
     * Permisos de compartir.
     */
    private boolean sharingperms;



    /**
     * Inicializacion y adaptador.
     * @param wordDoc El documento.
     */
    public WordDocGoogleAdapter(final IWordDocument wordDoc) {
        this.wordDocument = wordDoc;
        format = (Format) wordDoc.getFormat();
        font = (Font) wordDoc.getFormat();
        this.sharingperms = true;

    }

    /**
     * Estilo.
     * @return formato.
     */
    public Object getStyle() {
        return format;
    }
    /**
     * Fuente
     * @return Fuente.
     */
    public Font getFont() {
        return font;
    }

    /**
     * Permisos.
     * @param SharingPermissions verdadero o falso.
     */
    public void setSharingPermissions(final boolean SharingPermissions) {
        this.sharingperms = SharingPermissions;
    }
}
