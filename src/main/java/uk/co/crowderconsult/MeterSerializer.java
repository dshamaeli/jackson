package uk.co.crowderconsult;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

public class MeterSerializer extends JsonSerializer<Meter> {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public void serialize(Meter value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

    }
}
