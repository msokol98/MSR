package io.sokol.msr;

import io.sokol.msr.entity.ServiceRequest;
import io.sokol.msr.repository.PersonRepository;
import io.sokol.msr.repository.ServiceRequestRepository;
import io.sokol.msr.repository.VehicleRepository;
import io.sokol.msr.util.FakeDataCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsrApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepo;

	@Autowired
	private VehicleRepository vehicleRepo;

	@Autowired
	private ServiceRequestRepository requestRepo;

	public static void main(String[] args) {
		SpringApplication.run(MsrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		new FakeDataCreator().generate(personRepo, vehicleRepo, requestRepo);
	}
}

