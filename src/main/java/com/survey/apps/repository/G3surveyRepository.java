package com.survey.apps.repository;

import com.survey.apps.entity.G3survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G3surveyRepository extends ReactiveCrudRepository<G3survey, Integer> {

    Mono<G3survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
