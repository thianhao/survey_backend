package com.survey.apps.repository;

import com.survey.apps.entity.G4survey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface G4surveyRepository extends ReactiveCrudRepository<G4survey, Integer> {

    Mono<G4survey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
