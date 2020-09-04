package io.sokol.msr.util;

import com.github.javafaker.Faker;
import io.sokol.msr.entity.*;
import io.sokol.msr.repository.PersonRepository;
import io.sokol.msr.repository.ServiceRequestRepository;
import io.sokol.msr.repository.VehicleRepository;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

public class FakeDataCreator {

    public void generate(PersonRepository personRepo, VehicleRepository vehicleRepo, ServiceRequestRepository requestRepo) {
        Faker faker = new Faker();
        List<Vehicle> vehicles = null;
        int vehicleCounter = 0;

        try {
            vehicles = new FakeVehicleDataCreator().generate();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < 500; i++) {
            for(int j = 0; j < 3; j++) {
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String userName = faker.name().username();
                String streetAddress = faker.address().streetAddress();
                String email = faker.internet().emailAddress();
                String password = faker.internet().password();
                String phoneNumber = faker.phoneNumber().phoneNumber();

                Person p;

                switch(j % 3) {
                    case 0: p = new Employee(); break;
                    case 1: p = new Manager(); break;
                    case 2: p = new Customer(); break;
                    default: p = null;
                }

                p.setFirstName(firstName);
                p.setLastName(lastName);
                p.setAddress(streetAddress);
                p.setUserName(userName);
                p.setEmail(email);
                p.setPassword(password);
                p.setPhoneNumber(phoneNumber);

                personRepo.save(p);

                if(p.getClass() == Customer.class && vehicleCounter < vehicles.size()) {
                    for(int z = 0; z < 2; z++) {
                        Vehicle v = vehicles.get(vehicleCounter++);
                        vehicleRepo.save(v);
                        ((Customer) p).addVehicle(v);
                        v.setCustomer((Customer) p);
                        vehicleRepo.save(v);

                        ServiceRequest sr = new ServiceRequest();
                        sr.setDescription(faker.lorem().paragraph());
                        requestRepo.save(sr);

                        sr.setCustomer((Customer) p);
                        ((Customer) p).addServiceRequest(sr);

                        sr.setVehicle(v);
                        v.addServiceRequest(sr);

                        requestRepo.save(sr);
                    }
                }
            }
        }
    }
}
