package uk.co.crowderconsult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MeterTestText {

    private static final Logger LOG = LoggerFactory.getLogger(MeterTestText.class);

    @Test
    public void jacksonTest() throws IOException {
        
        Area area = new Area(123,"new area",true);
        Meter meter = new Meter(59,"METER");
        MeterType meterType = new MeterType(111,"inlet",50.00,100.00,250.00);
        List<Area> areas = new ArrayList<>();
        areas.add(area);
        meter.setAreaList(areas);
        meter.setMeteTypeId(meterType);
        meter.setMeasurementDataType(MeasurementDataType.FLOW);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(meter);
        LOG.info(json);
        Meter newMeter = mapper.readValue(json,Meter.class);
        LOG.info(newMeter.toString());
        MeterType type = newMeter.getMeteTypeId();
        LOG.info(type.toString());
        MeasurementDataType mdt = newMeter.getMeasurementDataType();
        LOG.info(mdt.toString());
    }
}