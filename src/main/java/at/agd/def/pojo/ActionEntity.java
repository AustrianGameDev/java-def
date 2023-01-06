package at.agd.def.pojo;

public class ActionEntity
{
    private final String ACTION_NAME;
    private StringKV name;
    private StringKV icon;
    private StringKV exec;

    public ActionEntity(String actionName, String name, String icon, String exec)
    {
        initFields();

        this.ACTION_NAME = actionName;
        this.name.setValue(name);
        this.icon.setValue(icon);
        this.exec.setValue(exec);
    }

    private void initFields()
    {
        this.name = new StringKV("Name");
        this.icon = new StringKV("Icon");
        this.exec = new StringKV("Exec");
    }

    public ActionEntity build()
    {
        return this;
    }

    @Override
    public String toString()
    {
        String result = "\n[Desktop Action " + ACTION_NAME + "]\n";
        result += name.toString();
        result += icon.toString();
        result += exec.toString();
        return result;
    }

    public String getActionName()
    {
        return ACTION_NAME;
    }
}
