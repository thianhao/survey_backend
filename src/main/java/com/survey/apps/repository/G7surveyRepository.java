package com.survey.apps.repository;

import com.survey.apps.entity.G7survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G7surveyRepository extends ReactiveCrudRepository<G7survey, Integer> {

    Mono<G7survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
