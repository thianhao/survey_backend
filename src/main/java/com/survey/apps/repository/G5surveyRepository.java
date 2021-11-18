package com.survey.apps.repository;

import com.survey.apps.entity.G5survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G5surveyRepository extends ReactiveCrudRepository<G5survey, Integer> {

    Mono<G5survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
