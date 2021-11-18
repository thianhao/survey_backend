package com.survey.apps.repository;

import com.survey.apps.entity.Csurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CsurveyRepository extends ReactiveCrudRepository<Csurvey,Integer> {

    Mono<Csurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);

}
