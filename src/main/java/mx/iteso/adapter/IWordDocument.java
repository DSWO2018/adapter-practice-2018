package mx.iteso.adapter;

import mx.iteso.adapter.beans.MSLicense;

public interface IWordDocument {
    public Object getFormat();
    public mx.iteso.adapter.beans.Image getBackground();
    public void setMSOfficeVersion(float msOfficeVersion);
    public MSLicense getLicense();
    public boolean restrictEditIfLicenseIsInvalid(MSLicense msLicense);

}
