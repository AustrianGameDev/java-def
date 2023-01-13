package at.agd.def;

import at.agd.def.exception.InvalidValueException;
import at.agd.def.pojo.*;

import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class DesktopEntryFile
{
    private StringKV type;
    private StringKV version;
    private LocaleStringKV name;
    private LocaleStringKV genericName;
    private BooleanKV noDisplay;
    private LocaleStringKV comment;
    private LocaleStringKV icon;
    private BooleanKV hidden;
    private StringsKV onlyShowIn;
    private StringsKV notShowIn;
    private BooleanKV dBusActivatable;
    private StringKV tryExec;
    private StringKV exec;
    private StringKV path;
    private BooleanKV terminal;
    private ActionList actions;
    private StringsKV mimeType;
    private StringsKV categories;
    private StringsKV implement;
    private LocaleStringsKV keywords;
    private BooleanKV startupNotify;
    private StringKV startupWMClass;
    private StringKV url;
    private BooleanKV prefersNonDefaultGPU;
    private BooleanKV singleMainWindow;

    private List<Key> keyList;

    public DesktopEntryFile(TypeEnum type, String name, List<LocalizedString> localizedNames, String url)
            throws InvalidValueException
    {
        init();

        switch(type)
        {
            case APPLICATION -> this.type.setValue("Application");
            case LINK -> this.type.setValue("Link");
            case DIRECTORY -> this.type.setValue("Directory");
        }

        this.name.setValue(name, localizedNames);

        if(type == TypeEnum.LINK)
        {
            if(url == null)
            {
                throw new InvalidValueException("URL cannot be null when Type is set to Link!");
            }
            else
            {
                this.url.setValue(url);
            }
        }
    }

    private void init()
    {
        this.type = new StringKV("Type");
        this.version = new StringKV("Version");
        this.name = new LocaleStringKV("Name");
        this.genericName = new LocaleStringKV("GenericName");
        this.noDisplay = new BooleanKV("NoDisplay");
        this.comment = new LocaleStringKV("Comment");
        this.icon = new LocaleStringKV("Icon");
        this.hidden = new BooleanKV("Hidden");
        this.onlyShowIn = new StringsKV("OnlyShowIn");
        this.notShowIn = new StringsKV("NotShowIn");
        this.dBusActivatable = new BooleanKV("DBusActivatable");
        this.tryExec = new StringKV("TryExec");
        this.exec = new StringKV("Exec");
        this.path = new StringKV("Path");
        this.terminal = new BooleanKV("Terminal");
        this.actions = new ActionList("Actions");
        this.mimeType = new StringsKV("MimeType");
        this.categories = new StringsKV("Categories");
        this.implement = new StringsKV("Implements");
        this.keywords = new LocaleStringsKV("Keywords");
        this.startupNotify = new BooleanKV("StartupNotify");
        this.startupWMClass = new StringKV("StartupWMClass");
        this.url = new StringKV("URL");
        this.prefersNonDefaultGPU = new BooleanKV("PrefersNonDefaultGPU");
        this.singleMainWindow = new BooleanKV("SingleMainWindow");

        this.keyList = new ArrayList<>();
        this.keyList.add(this.type);
        this.keyList.add(this.version);
        this.keyList.add(this.name);
        this.keyList.add(this.genericName);
        this.keyList.add(this.noDisplay);
        this.keyList.add(this.comment);
        this.keyList.add(this.icon);
        this.keyList.add(this.hidden);
        this.keyList.add(this.onlyShowIn);
        this.keyList.add(this.notShowIn);
        this.keyList.add(this.dBusActivatable);
        this.keyList.add(this.tryExec);
        this.keyList.add(this.exec);
        this.keyList.add(this.path);
        this.keyList.add(this.terminal);
        this.keyList.add(this.actions);
        this.keyList.add(this.mimeType);
        this.keyList.add(this.categories);
        this.keyList.add(this.implement);
        this.keyList.add(this.keywords);
        this.keyList.add(this.startupNotify);
        this.keyList.add(this.startupWMClass);
        this.keyList.add(this.url);
        this.keyList.add(this.prefersNonDefaultGPU);
        this.keyList.add(this.singleMainWindow);
    }

    public DesktopEntryFile withVersion(String version)
    {
        this.version.setValue(version);
        return this;
    }

    public DesktopEntryFile withGenericName(String genericName, List<LocalizedString> localizedGenericNames)
    {
        this.genericName.setValue(genericName, localizedGenericNames);
        return this;
    }

    public DesktopEntryFile withNoDisplay(boolean noDisplay)
    {
        this.noDisplay.setValue(noDisplay);
        return this;
    }

    public DesktopEntryFile withComment(String comment, List<LocalizedString> localizedComments)
    {
        this.comment.setValue(comment, localizedComments);
        return this;
    }

    public DesktopEntryFile withIcon(String icon, List<LocalizedString> localizedIcons)
    {
        this.icon.setValue(icon, localizedIcons);
        return this;
    }

    public DesktopEntryFile withHidden(boolean hidden)
    {
        this.hidden.setValue(hidden);
        return this;
    }

    public DesktopEntryFile withOnlyShowIn(List<String> onlyShowIn)
    {
        this.onlyShowIn.setValues(onlyShowIn);
        return this;
    }

    public DesktopEntryFile withNotShowIn(List<String> notShowIn)
    {
        this.notShowIn.setValues(notShowIn);
        return this;
    }

    public DesktopEntryFile withDBusActivatable(boolean dBusActivatable)
    {
        this.dBusActivatable.setValue(dBusActivatable);
        return this;
    }

    public DesktopEntryFile withTryExec(String tryExec)
    {
        this.tryExec.setValue(tryExec);
        return this;
    }

    public DesktopEntryFile withExec(String exec)
    {
        this.exec.setValue(exec);
        return this;
    }

    public DesktopEntryFile withPath(String path)
    {
        this.path.setValue(path);
        return this;
    }

    public DesktopEntryFile withTerminal(boolean terminal)
    {
        this.terminal.setValue(terminal);
        return this;
    }

    public DesktopEntryFile withAction(String actionName, String name, List<LocalizedString> localizedNames, String icon, List<LocalizedString> localizedIcons, String exec)
    {
        ActionEntity ae = new ActionEntity(actionName, name, localizedNames, icon, localizedIcons, exec).build();
        this.actions.add(ae);
        return this;
    }

    public DesktopEntryFile withMimeType(List<String> mimeType)
    {
        this.mimeType.setValues(mimeType);
        return this;
    }

    public DesktopEntryFile withCategories(List<String> categories)
    {
        this.categories.setValues(categories);
        return this;
    }

    public DesktopEntryFile withImplements(List<String> implement)
    {
        this.implement.setValues(implement);
        return this;
    }

    public DesktopEntryFile withKeywords(List<String> keywords, List<LocalizedStrings> localizedValues)
    {
        this.keywords.setValues(keywords, localizedValues);
        return this;
    }

    public DesktopEntryFile withStartupNotify(boolean startupNotify)
    {
        this.startupNotify.setValue(startupNotify);
        return this;
    }

    public DesktopEntryFile withStartupWMClass(String startupWMClass)
    {
        this.startupWMClass.setValue(startupWMClass);
        return this;
    }

    public DesktopEntryFile withPrefersNonDefaultGPU(boolean prefersNonDefaultGPU)
    {
        this.prefersNonDefaultGPU.setValue(prefersNonDefaultGPU);
        return this;
    }

    public DesktopEntryFile withSingleMainWindow(boolean singleMainWindow)
    {
        this.singleMainWindow.setValue(singleMainWindow);
        return this;
    }

    public void safeToFile(String path, String name, boolean override) throws FileAlreadyExistsException
    {
        DesktopEntryFileIO.safeDefToFile(this, path, name, override);
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder("[Desktop Entry]\n");
        for(Key item : this.keyList)
        {
            result.append(item.toString());
        }
        if(this.actions.size() > 0)
        {
            result.append(this.actions.actionsToString());
        }
        return result.toString();
    }
}
