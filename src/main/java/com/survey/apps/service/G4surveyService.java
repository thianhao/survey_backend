package com.survey.apps.service;

import com.survey.apps.entity.G4survey;
import com.survey.apps.repository.G4surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G4surveyService {

    @Autowired
    private G4surveyRepository repository;

    public Flux<G4survey> getAllG4survey(){
        return this.repository.findAll();
    }

    public Mono<G4survey> getG4surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G4survey> createG4survey(final G4survey _g4survey){
        return this.repository.save(_g4survey);
    }

    public Mono<G4survey> updateG4survey(String userid, final Mono<G4survey> _g4surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g4surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG4Q1(u.getG4Q1());
                    p.setG4Q2(u.getG4Q2());
                    p.setG4Q3(u.getG4Q3());
                    p.setG4Q4(u.getG4Q4());
                    p.setG4Q5(u.getG4Q5());
                    p.setG4Q6(u.getG4Q6());
                    p.setG4Q7(u.getG4Q7());
                    p.setG4Q8(u.getG4Q8());
                    p.setG4Q9(u.getG4Q9());
                    p.setG4Q10(u.getG4Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG4survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
