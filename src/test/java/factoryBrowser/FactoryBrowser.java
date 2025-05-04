package factoryBrowser;

import java.util.HashMap;
import java.util.Map;

public class FactoryBrowser {

    public static IBrowser make(String type){
        Map<String, IBrowser> browsermap = new HashMap<>();
        browsermap.put("chrome", new Chrome());
        browsermap.put("proxy", new ChromeProxy());

        return browsermap.containsKey(type.toLowerCase()) ? browsermap.get(type.toLowerCase()):
                new Chrome();

    }


}
