package at.agd.def.pojo;

import java.util.ArrayList;
import java.util.List;

public class LocaleStringKV extends Key
{
    private String value;
    private List<LocalizedString> localizedValues;

    public LocaleStringKV(String name)
    {
        super(name);
        this.value = null;
        this.localizedValues = null;
    }

    public void setValue(String value, List<LocalizedString> localizedValues)
    {
        this.value = value;
        if(localizedValues != null)
        {
            this.localizedValues = new ArrayList<>(localizedValues);
        }
    }

    @Override
    public String toString()
    {
        if(this.value == null)
        {
            return "";
        }

        StringBuilder result = new StringBuilder(this.name);
        result.append("=");
        result.append(this.value);
        result.append("\n");

        if(this.localizedValues != null)
        {
            for(LocalizedString localizedString : this.localizedValues)
            {
                String localizedValue = this.name + localizedString.toString();
                result.append(localizedValue);
            }
        }
        return result.toString();
    }
}
