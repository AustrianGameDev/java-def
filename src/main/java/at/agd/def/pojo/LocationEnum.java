package at.agd.def.pojo;

public enum LocationEnum
{
    USR("/usr/share/applications"),
    HOME(System.getProperty("user.home") + "/.local/share/applications");

    public String path;

    LocationEnum(String path)
    {
        this.path = path;
    }
}
