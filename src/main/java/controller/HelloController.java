package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue = "Guest") String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("/info")
    public AppInfo getInfo(){
        return new AppInfo("First Spring Boot App", "1.0.0");
    }

    static class AppInfo {
        private String name;
        private String version;

        public AppInfo(String name, String version){
            this.name = name;
            this.version = version;
        }
        public String getName(){
            return name;
        }

        public String getVersion(){
            return  version;
        }
    }
}
