package com.proyecto.services;

import com.proyecto.models.Contacto;
import com.proyecto.repository.CRUD;
import com.proyecto.repository.ContactoRepository;

import java.util.List;

public class ContactoServices extends CRUD<Contacto, ContactoRepository> {
    public ContactoServices(ContactoRepository repository) {
        super(repository);
    }

    @Override
    public List<Contacto> list() {
        return repository.findAll();
    }

    @Override
    public Contacto get(int id) {
        return null;
    }

    @Override
    public void add(Contacto o) {
        repository.save(o);
    }

    @Override
    public void update(Contacto o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
