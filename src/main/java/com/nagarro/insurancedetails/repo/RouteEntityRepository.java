package com.nagarro.insurancedetails.repo;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;
import com.nagarro.insurancedetails.entity.RouteEntity;

public interface RouteEntityRepository extends DatastoreRepository<RouteEntity, String> {
}
