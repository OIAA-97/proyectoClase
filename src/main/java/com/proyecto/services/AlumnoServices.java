package com.proyecto.services;

import com.proyecto.models.Alumno;
import com.proyecto.repository.AlumnoRepository;
import com.proyecto.repository.CRUD;

import java.util.List;

public class AlumnoServices extends CRUD<Alumno, AlumnoRepository> {
    public AlumnoServices(AlumnoRepository repository) {
        super(repository);
    }

    @Override
    public List<Alumno> list() {
        return repository.findAll();
    }

    @Override
    public Alumno get(int id) {
        return null;
    }

    @Override
    public void add(Alumno o) {
        repository.save(o);
    }

    @Override
    public void update(Alumno o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}
