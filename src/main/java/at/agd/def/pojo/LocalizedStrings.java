package at.agd.def.pojo;

import at.agd.def.util.Util;

import java.util.List;

public class LocalizedStrings
{
    private String postfix;
    private List<String> values;

    /**
     * @param postfix Required
     * @param values Required
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public LocalizedStrings(String postfix, List<String> values) throws NullPointerException, IllegalArgumentException
    {
        if(postfix == null || values == null)
        {
            throw new NullPointerException();
        }
        if(postfix.equals("") || values.size() == 0)
        {
            throw new IllegalArgumentException("Empty String or List not allowed!");
        }

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
        result.append(Util.listToString(this.values));
        result.append("\n");
        return result.toString();
    }
}
