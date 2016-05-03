package resources;

/**
 * Created by goutham on 03/05/16.
 */

import api.Color;
import com.codahale.metrics.annotation.Timed;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/color")
@Produces(MediaType.APPLICATION_JSON)
public class ColorResource {
    @GET
    @Timed
    public Color retColor(@DefaultValue("0") @QueryParam("r") double r,
                          @DefaultValue("0") @QueryParam("g") double g,
                          @DefaultValue("0") @QueryParam("b") double b) {

        return new Color(r, g, b);
    }
}
