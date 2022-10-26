package org.acme;

import org.acme.entity.Avenger;
import org.jboss.logging.Logger;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/hello")
public class GreetingResource {

    private AtomicInteger counter = new AtomicInteger(0);
    private static final Logger LOG = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String hello() {
        LOG.info("Invocation #" + counter.incrementAndGet());

        Avenger avenger = new Avenger("Iron Man", "Tony Stark", false);
        avenger.persist();

        return "Hello EclipseCon 2022";
    }
}