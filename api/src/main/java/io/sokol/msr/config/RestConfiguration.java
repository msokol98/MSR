package io.sokol.msr.config;

import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import io.sokol.msr.projection.PersonProjection;
import io.sokol.msr.projection.ServiceRequestProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(e -> e.getJavaType()).collect(Collectors.toList()).toArray(new Class[0]));
        config.getProjectionConfiguration().addProjection(PersonProjection.class);
        config.getProjectionConfiguration().addProjection(ServiceRequestProjection.class);
    }

}