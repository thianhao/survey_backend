package com.survey.apps.service;

import com.survey.apps.entity.G2survey;
import com.survey.apps.repository.G2surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G2surveyService {

    @Autowired
    private G2surveyRepository repository;

    public Flux<G2survey> getAllG2survey(){
        return this.repository.findAll();
    }

    public Mono<G2survey> getG2surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G2survey> createG2survey(final G2survey _g2survey){
        return this.repository.save(_g2survey);
    }

    public Mono<G2survey> updateG2survey(String userid, final Mono<G2survey> _g2surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g2surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG2Q1(u.getG2Q1());
                    p.setG2Q2(u.getG2Q2());
                    p.setG2Q3(u.getG2Q3());
                    p.setG2Q4(u.getG2Q4());
                    p.setG2Q5(u.getG2Q5());
                    p.setG2Q6(u.getG2Q6());
                    p.setG2Q7(u.getG2Q7());
                    p.setG2Q8(u.getG2Q8());
                    p.setG2Q9(u.getG2Q9());
                    p.setG2Q10(u.getG2Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG2survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
