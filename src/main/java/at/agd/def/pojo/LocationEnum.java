package at.agd.def.pojo;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

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
