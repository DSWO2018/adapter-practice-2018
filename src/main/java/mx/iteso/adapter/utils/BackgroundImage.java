package mx.iteso.adapter.utils;

/**
 *
 */
public class BackgroundImage {

    /**
     *
     */
    private String url;

    /**
     * @param u .
     */
    public BackgroundImage(final String u) {
        this.url = u;
    }

    /**
     * @return .
     */
    public final String getBackground() {
       return this.url;
    }
}
