package org.laetproject.socialmedia.resources;

import org.laetproject.socialmedia.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria", "maria@gmail.com");
        User gabriel = new User("2", "Gabriel", "gabriel@gmail.com");
        return ResponseEntity.ok().body(List.of(maria, gabriel));

    }
}
