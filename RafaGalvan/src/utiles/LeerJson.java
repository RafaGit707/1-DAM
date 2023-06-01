import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class LeerJson {
    public static List<Profesor> leerJson(String archivoJson) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Profesor> profesores = objectMapper.readValue(new File(archivoJson),
                    new TypeReference<List<Profesor>>() {
                    });
            return profesores;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}