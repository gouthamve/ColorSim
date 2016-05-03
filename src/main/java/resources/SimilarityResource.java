package resources;

/**
 * Created by goutham on 03/05/16.
 */
import api.Color;
import api.Similarity;
import com.codahale.metrics.annotation.Timed;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/similarity")
@Produces(MediaType.APPLICATION_JSON)
public class SimilarityResource {
    @GET
    @Timed
    public Similarity retSimilarity(@DefaultValue("0") @QueryParam("r1") double r1,
                                    @DefaultValue("0") @QueryParam("g1") double g1,
                                    @DefaultValue("0") @QueryParam("b1") double b1,
                                    @DefaultValue("0") @QueryParam("r2") double r2,
                                    @DefaultValue("0") @QueryParam("g2") double g2,
                                    @DefaultValue("0") @QueryParam("b2") double b2) {
        Color c1 = new Color(r1, g1, b1);
        Color c2 = new Color(r2, g2, b2);
        return new Similarity(c1, c2);
    }
}
