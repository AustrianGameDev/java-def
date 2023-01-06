package at.agd.def;

import at.agd.def.pojo.*;

import java.util.ArrayList;
import java.util.List;

public class DesktopEntryFile
{
    private StringKV type;
    private StringKV version;
    private StringKV name;
    private StringKV genericName;
    private BooleanKV noDisplay;
    private StringKV comment;
    private StringKV icon;
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
    private StringsKV keywords;
    private BooleanKV startupNotify;
    private StringKV startupWMClass;
    private StringKV url;
    private BooleanKV prefersNonDefaultGPU;
    private BooleanKV singleMainWindow;

    private List<Key> keyList;

    public DesktopEntryFile(TypeEnum type, String name, String url)
    {
        init();
    }

    private void init()
    {
        this.type = new StringKV("Type");
        this.version = new StringKV("Version");
        this.name = new StringKV("Name");
        this.genericName = new StringKV("GenericName");
        this.noDisplay = new BooleanKV("NoDisplay");
        this.comment = new StringKV("Comment");
        this.icon = new StringKV("Icon");
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
        this.keywords = new StringsKV("Keywords");
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
}
