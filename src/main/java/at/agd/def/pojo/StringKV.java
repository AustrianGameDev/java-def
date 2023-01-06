package at.agd.def.pojo;

public class StringKV extends Key
{
    private String value;

    public StringKV(String name)
    {
        super(name);
        this.value = null;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        if(this.value == null)
        {
            return "";
        }
        return this.name + "=" + this.value + "\n";
    }
}
