package at.agd.def.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActionList extends Key
{
    private List<ActionEntity> actionEntities;

    public ActionList(String name)
    {
        super(name);
        this.actionEntities = new ArrayList<>();
    }

    public void add(ActionEntity newActionEntity)
    {
        // ToDo: Compare
        this.actionEntities.add(newActionEntity);
    }

    public int size()
    {
        return this.actionEntities.size();
    }

    @Override
    public String toString()
    {
        if(size() == 0)
        {
            return "";
        }

        StringBuilder result = new StringBuilder(this.name + "=");
        for(int i = 0; i < size(); i++)
        {
            result.append(this.actionEntities.get(i).getActionName());
            result.append(i < size() - 1 ? ";" : "");
        }
        result.append("\n");
        return result.toString();
    }

    public String actionsToString()
    {
        StringBuilder result = new StringBuilder();
        for(ActionEntity ae : this.actionEntities)
        {
            result.append(ae.toString());
        }
        return result.toString();
    }
}
