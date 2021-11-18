package com.survey.apps.service;

import com.survey.apps.entity.G8survey;
import com.survey.apps.repository.G8surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G8surveyService {

    @Autowired
    private G8surveyRepository repository;

    public Flux<G8survey> getAllG8survey(){
        return this.repository.findAll();
    }

    public Mono<G8survey> getG8surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G8survey> createG8survey(final G8survey _g8survey){
        return this.repository.save(_g8survey);
    }

    public Mono<G8survey> updateG8survey(String userid, final Mono<G8survey> _g8surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g8surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());
                    p.setG8Q1(u.getG8Q1());
                    p.setGps_loc(u.getGps_loc());
                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG8survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
