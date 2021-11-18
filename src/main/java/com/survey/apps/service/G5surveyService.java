package com.survey.apps.service;

import com.survey.apps.entity.G5survey;
import com.survey.apps.repository.G5surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G5surveyService {

    @Autowired
    private G5surveyRepository repository;

    public Flux<G5survey> getAllG5survey(){
        return this.repository.findAll();
    }

    public Mono<G5survey> getG5surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G5survey> createG5survey(final G5survey _g5survey){
        return this.repository.save(_g5survey);
    }

    public Mono<G5survey> updateG5survey(String userid, final Mono<G5survey> _g5surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g5surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG5Q1(u.getG5Q1());
                    p.setG5Q2(u.getG5Q2());
                    p.setG5Q3(u.getG5Q3());
                    p.setG5Q4(u.getG5Q4());
                    p.setG5Q5(u.getG5Q5());
                    p.setG5Q6(u.getG5Q6());
                    p.setG5Q7(u.getG5Q7());
                    p.setG5Q8(u.getG5Q8());
                    p.setG5Q9(u.getG5Q9());
                    p.setG5Q10(u.getG5Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG5survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
