package demo.helloworld;

import demo.api.extension.PluginRegister;
import org.pf4j.Extension;

/**
 * @author Xu Cheng
 */
@Extension
public class HelloworldRegister implements PluginRegister {

    @Override
    public String name() {
        return "helloworld";
    }
}
