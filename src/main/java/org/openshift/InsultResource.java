package org.openshift;

import        java.util.HashMap;
import        javax.enterprise.context.RequestScoped;
import        javax.ws.rs.GET;
import        javax.ws.rs.Path;
import        javax.ws.rs.Produces;

@RequestScoped
@Path("/insult")
public class InsultResource {
    @GET()
    @Produces("application/json")
    public HashMap<String, String> getInsult() {
        HashMap<String, String> theInsult = new HashMap<String, String>();
        String s = new InsultGenerator().generateInsult();
        theInsult.put("insult", s);
        System.out.println("InsultResource: "+s);
        return theInsult;
    }
}