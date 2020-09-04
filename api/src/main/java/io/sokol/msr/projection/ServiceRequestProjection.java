package io.sokol.msr.projection;

import io.sokol.msr.entity.ServiceRequest;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Projection(
        name = "1",
        types = { ServiceRequest.class }
)
public interface ServiceRequestProjection {

    long getId();
    String getDescription();

    @DateTimeFormat(pattern = "dd MM yyyy")
    LocalDate getCreationDate();

    @DateTimeFormat(pattern = "dd MM yyyy")
    LocalDate getLastUpdatedDate();
}
