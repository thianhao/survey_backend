package com.survey.apps.service;

import com.survey.apps.entity.G6survey;
import com.survey.apps.repository.G6surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G6surveyService {

    @Autowired
    private G6surveyRepository repository;

    public Flux<G6survey> getAllG6survey(){
        return this.repository.findAll();
    }

    public Mono<G6survey> getG6surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G6survey> createG6survey(final G6survey _g6survey){
        return this.repository.save(_g6survey);
    }

    public Mono<G6survey> updateG6survey(String userid, final Mono<G6survey> _g6surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g6surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG6Q1(u.getG6Q1());
                    p.setG6Q2(u.getG6Q2());
                    p.setG6Q3(u.getG6Q3());
                    p.setG6Q4(u.getG6Q4());
                    p.setG6Q5(u.getG6Q5());
                    p.setG6Q6(u.getG6Q6());
                    p.setG6Q7(u.getG6Q7());
                    p.setG6Q8(u.getG6Q8());
                    p.setG6Q9(u.getG6Q9());
                    p.setG6Q10(u.getG6Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG6survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
