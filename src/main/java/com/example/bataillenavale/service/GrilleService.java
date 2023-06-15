package com.example.bataillenavale.service;

import com.example.bataillenavale.entity.Grille;
import com.example.bataillenavale.repository.GrilleRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GrilleService {

    private SessionFactory _sessionFactory;
    private GrilleRepository grilleRepository;
    private Session session;

    public GrilleService (SessionFactory sessionFactory){
        _sessionFactory = sessionFactory;
    }

    public boolean createGrille (){
        boolean result = false;
        session = _sessionFactory.openSession();
        session.beginTransaction();
        grilleRepository = new GrilleRepository(session);
        Grille grille =new Grille();
        try{
            grilleRepository.create(grille);
            session.getTransaction().commit();
            result = true;
        }catch (Exception e){
            try{
                session.getTransaction().rollback();
            }catch (Exception except){
                System.out.println(except.getMessage());
            }
        }finally {
            session.close();
        }
        return result;
    }
}
