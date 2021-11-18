package com.survey.apps.repository;

import com.survey.apps.entity.G8survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G8surveyRepository extends ReactiveCrudRepository<G8survey, Integer> {

    Mono<G8survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
