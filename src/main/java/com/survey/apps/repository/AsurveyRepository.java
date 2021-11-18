package com.survey.apps.repository;

import com.survey.apps.entity.Asurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface AsurveyRepository extends ReactiveCrudRepository<Asurvey,Integer> {

    Mono<Asurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);

}
