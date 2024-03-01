package com.nagarro.insurancedetails.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.insurancedetails.entity.RouteEntity;
import com.nagarro.insurancedetails.repo.RouteEntityRepository;


@Service
public class RouteEntityService {

    private final RouteEntityRepository repository;

    @Autowired
    public RouteEntityService(RouteEntityRepository repository) {
        this.repository = repository;
    }

    public RouteEntity saveRoute(RouteEntity routeEntity) {
        return repository.save(routeEntity);
    }

    public Iterable<RouteEntity> getAllRoutes() {
        return repository.findAll();
    }
}
