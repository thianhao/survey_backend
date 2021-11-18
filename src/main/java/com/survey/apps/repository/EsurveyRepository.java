package com.survey.apps.repository;

import com.survey.apps.entity.Esurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface EsurveyRepository extends ReactiveCrudRepository<Esurvey,Integer> {

    Mono<Esurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
