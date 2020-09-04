package io.sokol.msr.projection;

import io.sokol.msr.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "1",
        types = { Person.class }
)
public interface PersonProjection {

    long getId();

    @Value("#{target.getFirstName() + \" \" + target.getLastName()}")
    String getName();

    String getEmail();

    @Value("#{target.getClass().toString().substring(26)}")
    String getType();

}
