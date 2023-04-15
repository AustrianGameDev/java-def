package at.agd.def.pojo;

public enum TypeEnum
{
    APPLICATION("Application"),
    LINK("Link"),
    DIRECTORY("Directory");

    public String typeStr;

    TypeEnum(String typeStr)
    {
        this.typeStr = typeStr;
    }
}
