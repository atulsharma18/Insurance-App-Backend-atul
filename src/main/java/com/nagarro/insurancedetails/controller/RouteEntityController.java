package com.nagarro.insurancedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.insurancedetails.entity.RouteEntity;
import com.nagarro.insurancedetails.service.RouteEntityService;

@RestController
@RequestMapping("/api/routes")
@CrossOrigin(value = "http://localhost:4200")
public class RouteEntityController {

    private final RouteEntityService routeEntityService;

    @Autowired
    public RouteEntityController(RouteEntityService routeEntityService) {
        this.routeEntityService = routeEntityService;
    }

    @PostMapping
    public ResponseEntity<RouteEntity> saveRoute(@RequestBody RouteEntity routeEntity) {
        RouteEntity savedRoute = routeEntityService.saveRoute(routeEntity);
        return new ResponseEntity<>(savedRoute, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<RouteEntity>> getAllRoutes() {
        Iterable<RouteEntity> routes = routeEntityService.getAllRoutes();
        return new ResponseEntity<>(routes, HttpStatus.OK);
    }

}


