package at.agd.def.pojo;

public class BooleanKV extends Key
{
    private Boolean value;

    public BooleanKV(String name)
    {
        super(name);
        value = null;
    }

    public void setValue(boolean value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        if(value == null)
        {
            return "";
        }
        return this.name + "=" + this.value.toString() + "\n";
    }
}
