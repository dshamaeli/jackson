package uk.co.crowderconsult;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MeterTestText {


    @Test
    public void jacksonTest(){
        Area area = new Area(123,"new area",true);
        Meter meter = new Meter(59,"METER");
        List<Area> areas = new ArrayList<>();
        areas.add(area);
        meter.setAreaList(areas);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(meter,Meter.class);

    }
}