package at.agd.def.pojo;

import java.util.List;

public class LocalizedStrings
{
    private String postfix;
    private List<String> values;

    public LocalizedStrings(String postfix, List<String> values)
    {
        this.postfix = postfix;
        this.values = values;
    }

    @Override
    public String toString()
    {
        if(this.postfix == null || this.values == null)
        {
            System.out.println("Error");
        }

        StringBuilder result = new StringBuilder("[").append(this.postfix).append("]=");
        for(int i = 0; i < this.values.size(); i++)
        {
            result.append(this.values.get(i));
            result.append(i < this.values.size() - 1 ? ";" : "");
        }
        result.append("\n");
        return result.toString();
    }
}
