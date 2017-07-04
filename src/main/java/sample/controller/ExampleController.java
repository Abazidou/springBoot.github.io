package sample.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sample.repositories.TopicRepository;;import javax.websocket.server.PathParam;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public String test() {
        return "Test de malade !!!!";
    }


}