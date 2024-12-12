package so.fine.codingchallenge.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "zip")
@Data
public class ZipToCityConfig {
    private Map<String, String> zipMap = new HashMap<>();;
}
