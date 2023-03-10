package at.agd.def.pojo;

import at.agd.def.util.Util;

import java.util.ArrayList;
import java.util.List;

public class LocaleStringsKV extends Key
{
    private List<String> values;
    private List<LocalizedStrings> localizedValues;

    public LocaleStringsKV(String name)
    {
        super(name);
        this.values = new ArrayList<>();
        this.localizedValues = null;
    }

    public void setValues(List<String> values, List<LocalizedStrings> localizedValues)
    {
        if(values == null)
        {
            throw new NullPointerException("null is not allowed here");
        }

        this.values.addAll(values);

        if(localizedValues != null)
        {
            this.localizedValues = new ArrayList<>(localizedValues);
        }
    }

    @Override
    public String toString()
    {
        if(this.values.size() == 0)
        {
            return "";
        }

        StringBuilder result = new StringBuilder(this.name).append("=");
        result.append(Util.listToString(this.values));
        result.append("\n");
        for(int i = 0; i < this.localizedValues.size(); i++)
        {
            result.append(this.name).append(this.localizedValues.get(i).toString());
        }
        return result.toString();
    }
}
