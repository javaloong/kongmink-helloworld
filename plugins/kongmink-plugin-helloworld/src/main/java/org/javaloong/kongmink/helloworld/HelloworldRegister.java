package org.javaloong.kongmink.helloworld;

import org.javaloong.kongmink.api.extension.PluginRegister;
import org.pf4j.Extension;

/**
 * @author Xu Cheng
 */
@Extension
public class HelloworldRegister implements PluginRegister {

    @Override
    public String name() {
        return "hellword";
    }
}
