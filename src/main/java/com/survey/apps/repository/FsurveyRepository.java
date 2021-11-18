package com.survey.apps.repository;

import com.survey.apps.entity.Fsurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface FsurveyRepository extends ReactiveCrudRepository<Fsurvey,Integer> {

    Mono<Fsurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);

}
