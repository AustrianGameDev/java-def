package at.agd.def.pojo;

public class LocalizedString
{
    private String postfix;
    private String value;

    public LocalizedString(String postfix, String value)
    {
        this.postfix = postfix;
        this.value = value;
    }

    @Override
    public String toString()
    {
        if(this.postfix == null || this.value == null)
        {
            System.out.println("Error");
        }
        return "[" + this.postfix + "]=" + this.value + "\n";
    }
}
