package com.survey.apps.repository;

import com.survey.apps.entity.G6survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G6surveyRepository extends ReactiveCrudRepository<G6survey, Integer> {
    Mono<G6survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
