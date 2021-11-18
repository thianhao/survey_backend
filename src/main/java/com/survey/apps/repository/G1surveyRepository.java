package com.survey.apps.repository;

import com.survey.apps.entity.G1survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G1surveyRepository extends ReactiveCrudRepository<G1survey,Integer> {

    Mono<G1survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);

}
