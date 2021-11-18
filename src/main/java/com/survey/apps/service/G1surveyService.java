package com.survey.apps.service;

import com.survey.apps.entity.G1survey;
import com.survey.apps.repository.G1surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G1surveyService {

    @Autowired
    private G1surveyRepository repository;

    public Flux<G1survey> getAllG1survey(){
        return this.repository.findAll();
    }

    public Mono<G1survey> getG1surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G1survey> createG1survey(final G1survey _g1survey){
        return this.repository.save(_g1survey);
    }

    public Mono<G1survey> updateG1survey(String userid, final Mono<G1survey> _g1surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g1surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG1Q1(u.getG1Q1());
                    p.setG1Q2(u.getG1Q2());
                    p.setG1Q3(u.getG1Q3());
                    p.setG1Q4(u.getG1Q4());
                    p.setG1Q5(u.getG1Q5());
                    p.setG1Q6(u.getG1Q6());
                    p.setG1Q7(u.getG1Q7());
                    p.setG1Q8(u.getG1Q8());
                    p.setG1Q9(u.getG1Q9());
                    p.setG1Q10(u.getG1Q10());

                    p.setG1Q11(u.getG1Q11());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG1survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
