package mx.iteso.adapter.impl.test;

import mx.iteso.adapter.WordDocument;
import mx.iteso.adapter.impl.WordDocAdapter;
import mx.iteso.adapter.utils.Font;
import mx.iteso.adapter.utils.Format;
import mx.iteso.adapter.utils.Image;

import org.junit.Assert;
import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WordDocAdapterTest {
    WordDocAdapter wordDocAdapter;
    WordDocument mockedWordDoc;
    Format format;
    @Before
    public void setUp(){
        mockedWordDoc = mock(WordDocument.class);
       format = (Format)mockedWordDoc.getFormat();
//      when(mockedWordDoc.getFormat()).thenReturn(new Format(new Font("Arial")));
//      when(mockedWordDoc.getBackground()).thenReturn(new Image("image.com"));
        wordDocAdapter = new WordDocAdapter(mockedWordDoc);

    }

    @org.junit.Test
    public void getFontTest() {
        Font result = wordDocAdapter.getFont();


    }

    @org.junit.Test
    public void getStyleTest() {
        String result = (String) wordDocAdapter.getStyle();
        Assert.assertEquals("bold", result);

    }

    @org.junit.Test
    public void getBackgroundTest() {
        String backgroundImage = wordDocAdapter.getBackground().getBackground();
        Assert.assertEquals("image.com", backgroundImage);
    }

    @org.junit.Test
    public void setSharingPermissionsTest() {
        wordDocAdapter.setSharingPermissions(3);

    }
}