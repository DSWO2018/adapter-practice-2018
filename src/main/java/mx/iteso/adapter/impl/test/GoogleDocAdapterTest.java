package mx.iteso.adapter.impl.test;

import mx.iteso.adapter.GoogleDoc;
import mx.iteso.adapter.MSLicense;
import mx.iteso.adapter.impl.GoogleDocAdapter;
import mx.iteso.adapter.utils.BackgroundImage;
import mx.iteso.adapter.utils.Font;
import org.junit.Assert;
import org.junit.Before;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GoogleDocAdapterTest {
    GoogleDocAdapter googleDocAdapter;
    GoogleDoc mockedGoogleDoc;
    MSLicense msl = new MSLicense("Google MSLicense");

    @Before
    public void setUp(){
        mockedGoogleDoc = mock(GoogleDoc.class);
        googleDocAdapter = new GoogleDocAdapter(mockedGoogleDoc);
  //      when(mockedGoogleDoc.getFont()).thenReturn(new Font("Arial"));
    //    when(mockedGoogleDoc.getBackground()).thenReturn(new BackgroundImage("image.com"));
    }

    @org.junit.Test
    public void getFormatTest() {
        String result = googleDocAdapter.getFormat().getFont();
        Assert.assertEquals("Arial", result);
    }

    @org.junit.Test
    public void getBackgroundTest() {
        when(mockedGoogleDoc.getBackground()).thenReturn(new BackgroundImage("image.com"));
        String result = googleDocAdapter.getBackground().getImage();
        Assert.assertEquals("image.com", result);

    }

    @org.junit.Test
    public void setMSOfficeVersionTest() {
        googleDocAdapter.setMSOfficeVersion(3);
        Assert.assertEquals(3,googleDocAdapter.getMSOfficeVersion(), 0);
    }

    @org.junit.Test
    public void getLicenseTest() {
        String result = googleDocAdapter.getLicense().getLicense();
        Assert.assertEquals("Google MSLicense", result);
    }

    @org.junit.Test
    public void restrictEditIfLicenseIsInvalidTestFalse() {
        MSLicense ms = new MSLicense("Ms");
        boolean result = googleDocAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(false, result);

    }
    @org.junit.Test
    public void restrictEditIfLicenseIsInvalidTestTrue() {
        MSLicense ms = new MSLicense("Google MSLicense");
        boolean result = googleDocAdapter.restrictEditIfLicenseIsInvalid(ms);
        Assert.assertEquals(true, result);

    }
}
