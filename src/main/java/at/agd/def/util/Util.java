package at.agd.def.util;

import java.util.List;

public class Util
{
    public static String listToString(List<String> list)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < list.size(); i++)
        {
            result.append(list.get(i));
            result.append(i < list.size() - 1 ? ";" : "");
        }
        return result.toString();
    }
}
