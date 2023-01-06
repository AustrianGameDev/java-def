package at.agd.def.pojo;

import java.util.ArrayList;
import java.util.List;

public class StringsKV extends Key
{
    private List<String> values;

    public StringsKV(String name)
    {
        super(name);
        values = new ArrayList<>();
    }

    public void withValues(List<String> values)
    {
        this.values.addAll(values);
    }

    @Override
    public String toString()
    {
        if(this.values.size() == 0)
        {
            return "";
        }

        StringBuilder result = new StringBuilder(this.name + "=");
        for(int i = 0; i < values.size(); i++)
        {
            result.append(values.get(i));
            result.append((i < values.size() - 1 ? ";" : ""));
        }
        result.append("\n");
        return result.toString();
    }
}
