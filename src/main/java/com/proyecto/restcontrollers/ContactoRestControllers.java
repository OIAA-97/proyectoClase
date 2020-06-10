package com.proyecto.restcontrollers;


import com.proyecto.models.Contacto;
import com.proyecto.services.ContactoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacto")
public class ContactoRestControllers {

    @Autowired
    ContactoServices services;

    @GetMapping("/list")
    public List<Contacto> list(){
        return services.list();
    }

    @PostMapping("/add")
    public void add(@RequestBody Contacto contacto){
        services.add(contacto);
    }

    @DeleteMapping("/delele/{id}")
    public void update(@PathVariable int id){
        services.delete(id);
    }

}
