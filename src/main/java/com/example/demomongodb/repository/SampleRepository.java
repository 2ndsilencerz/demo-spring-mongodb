package com.example.demomongodb.repository;

import com.example.demomongodb.entity.SampleEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends MongoRepository<SampleEntity, String> {
}
