package com.survey.apps.repository;

import com.survey.apps.entity.Bsurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface BsurveyRepository extends ReactiveCrudRepository<Bsurvey,Integer> {

    Mono<Bsurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);
}
