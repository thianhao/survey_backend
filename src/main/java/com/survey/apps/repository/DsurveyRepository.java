package com.survey.apps.repository;

import com.survey.apps.entity.Dsurvey;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface DsurveyRepository extends ReactiveCrudRepository<Dsurvey,Integer>  {

    Mono<Dsurvey> findByUserid(String userid);

    Mono<Void> deleteByUserid(String userid);

    Mono<Boolean> existsByUserid(String userid);

}
