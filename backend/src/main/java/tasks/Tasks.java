package tasks;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tasks {
    String dates;
    String heures;
    String duree;
    String titre;
    String description;

    @GetMapping("api/titre")
    public Map<String, String> titre() {
        return Map.of("Titre", "Voici un titre de test");
    }
}
