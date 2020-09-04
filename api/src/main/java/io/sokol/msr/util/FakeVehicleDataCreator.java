package io.sokol.msr.util;

import java.awt.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.sokol.msr.entity.Vehicle;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FakeVehicleDataCreator {

    public List<Vehicle> generate() throws IOException, ParseException {
        List<Vehicle> vehicles = new ArrayList<>();
        JSONParser jsonParser = new JSONParser();
        JSONArray a = (JSONArray) jsonParser.parse(new FileReader("/home/mitchell/Projects/msr/api/mock_vehicles.json"));
        int counter = 0;
        for (Object o : a) {
            JSONObject vehicleJSON = (JSONObject) o;
            String make = (String) vehicleJSON.get("make");
            String model = (String) vehicleJSON.get("model");
            int year = ((Long) vehicleJSON.get("year")).intValue();
            Vehicle v = new Vehicle();
            v.setMake(make);
            v.setModel(model);
            v.setYear(year);
            v.setColor(getColor(counter).toString());
            vehicles.add(v);
            counter++;
        }
        return vehicles;
    }

    private Color getColor(int counter) {
        switch(counter % 6) {
            case 0: return Color.BLACK;
            case 1: return Color.BLUE;
            case 2: return Color.GRAY;
            case 3: return Color.RED;
            case 4: return Color.WHITE;
            case 5: return Color.GREEN;
            default: return Color.ORANGE;
        }
    }

}


