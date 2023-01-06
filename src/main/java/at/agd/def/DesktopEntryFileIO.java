package at.agd.def;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DesktopEntryFileIO
{
    public static void safeDefToFile(DesktopEntryFile def, String pathStr, String filename, boolean override)
            throws FileAlreadyExistsException
    {
        Path path = Paths.get(pathStr, filename);
        File file = new File(path.toString());

        if(file.exists() && !override)
        {
            throw new FileAlreadyExistsException("The file " + path.toString() + " already exists!");
        }

        try
        {
            FileWriter fw = new FileWriter(file, false);
            fw.write(def.toString());
            fw.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
