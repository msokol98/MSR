package io.sokol.msr;

import io.sokol.msr.entity.WebMaster;
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
		WebMaster webMaster = new WebMaster();
		webMaster.setFirstName("Mitchell");
		webMaster.setLastName("Sokol");
		webMaster.setAddress("105 Covewood Ct");
		webMaster.setPassword("a");
		webMaster.setPhoneNumber("919-791-5823");
		webMaster.setEmail("msokol98@gmail.com");
		webMaster.setUserName("msokol98");
		personRepo.save(webMaster);
	}
}

