package mx.iteso.adapter;

import mx.iteso.adapter.beans.worddoc.Image;
import mx.iteso.adapter.beans.worddoc.MSLicense;

public interface IWordDocument {
    public Object getFormat();
    public Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
