package at.agd.def.pojo;

public class LocalizedString
{
    private String postfix;
    private String value;

    /**
     * @param postfix Required
     * @param value Required
     * @throws NullPointerException
     * @throws IllegalArgumentException
     */
    public LocalizedString(String postfix, String value) throws NullPointerException, IllegalArgumentException
    {
        if(postfix == null || value == null)
        {
            throw new NullPointerException();
        }
        if(postfix.equals("") || value.equals(""))
        {
            throw new IllegalArgumentException("Empty String not allowed!");
        }

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
