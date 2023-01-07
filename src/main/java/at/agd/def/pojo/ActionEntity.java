package at.agd.def.pojo;

import java.util.List;

public class ActionEntity
{
    private final String ACTION_NAME;
    private LocaleStringKV name;
    private LocaleStringKV icon;
    private StringKV exec;

    public ActionEntity(String actionName, String name, List<LocalizedString> localizedNames, String icon, List<LocalizedString> localizedIcons, String exec)
    {
        initFields();

        this.ACTION_NAME = actionName;
        this.name.setValue(name, localizedNames);
        this.icon.setValue(icon, localizedIcons);
        this.exec.setValue(exec);
    }

    private void initFields()
    {
        this.name = new LocaleStringKV("Name");
        this.icon = new LocaleStringKV("Icon");
        this.exec = new StringKV("Exec");
    }

    public ActionEntity build()
    {
        return this;
    }

    @Override
    public String toString()
    {
        String result = "\n[Desktop Action " + this.ACTION_NAME + "]\n";
        result += this.name.toString();
        result += this.icon.toString();
        result += this.exec.toString();
        return result;
    }

    public String getActionName()
    {
        return this.ACTION_NAME;
    }
}
