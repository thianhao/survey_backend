package com.survey.apps.service;

import com.survey.apps.entity.G3survey;
import com.survey.apps.repository.G3surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G3surveyService {

    @Autowired
    private G3surveyRepository repository;

    public Flux<G3survey> getAllG3survey(){
        return this.repository.findAll();
    }

    public Mono<G3survey> getG3surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G3survey> createG3survey(final G3survey _g3survey){
        return this.repository.save(_g3survey);
    }

    public Mono<G3survey> updateG3survey(String userid, final Mono<G3survey> _g3surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g3surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG3Q1(u.getG3Q1());
                    p.setG3Q2(u.getG3Q2());
                    p.setG3Q3(u.getG3Q3());
                    p.setG3Q4(u.getG3Q4());
                    p.setG3Q5(u.getG3Q5());
                    p.setG3Q6(u.getG3Q6());
                    p.setG3Q7(u.getG3Q7());
                    p.setG3Q8(u.getG3Q8());
                    p.setG3Q9(u.getG3Q9());
                    p.setG3Q10(u.getG3Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG3survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
