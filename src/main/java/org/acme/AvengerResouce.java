package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;
import org.acme.entity.Avenger;

@ResourceProperties(path = "/avenger")
public interface AvengerResouce extends PanacheEntityResource<Avenger, Long> {
}
