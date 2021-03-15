package demo.helloworld;

import org.javaloong.kongmink.pf4j.spring.boot.SpringBootPlugin;
import org.javaloong.kongmink.pf4j.spring.boot.SpringBootstrap;
import org.pf4j.PluginWrapper;

/**
 * @author Xu Cheng
 */
public class HelloworldPlugin extends SpringBootPlugin {

    public HelloworldPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    protected SpringBootstrap createSpringBootstrap() {
        return new SpringBootstrap(this, HelloworldPluginStarter.class);
    }
}
