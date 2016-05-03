/**
 * Created by goutham on 03/05/16.
 */

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.ColorResource;
import resources.SimilarityResource;

public class ColorSimApp extends Application<ColorSimConfig> {
    public static void main(String[] args) throws Exception {
        new ColorSimApp().run(args);
    }

    @Override
    public String getName() {
        return "color-sim";
    }

    @Override
    public void initialize(Bootstrap<ColorSimConfig> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ColorSimConfig configuration, Environment environment) {
        final ColorResource resource1 = new ColorResource();
        environment.jersey().register(resource1);
        final SimilarityResource resource2 = new SimilarityResource();
        environment.jersey().register(resource2);
    }

}
