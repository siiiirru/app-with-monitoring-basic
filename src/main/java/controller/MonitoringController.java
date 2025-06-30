package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringController {

    @GetMapping(value="/")
    public String checkMonitoring() {
        return "app-with-monitoring-basic";
    }

    @GetMapping(value="/api/monitoring")
    public String getMonitoring() {
        return "app-with-monitoring-basic-get-monitoring";
    }
}
