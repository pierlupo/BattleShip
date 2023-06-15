package com.example.bataillenavale.repository;

import com.example.bataillenavale.entity.Grille;
import org.hibernate.Session;

import java.util.List;

public class GrilleRepository extends Repository<Grille>{

    public GrilleRepository(Session session) {
        super(session);
    }

    @Override
    Grille findById(int id) {
        return null;
    }

    @Override
    List<Grille> findAll() {
        return null;
    }


}
