package com.survey.apps.service;

import com.survey.apps.entity.G7survey;
import com.survey.apps.repository.G7surveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class G7surveyService {

    @Autowired
    private G7surveyRepository repository;

    public Flux<G7survey> getAllG7survey(){
        return this.repository.findAll();
    }

    public Mono<G7survey> getG7surveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<G7survey> createG7survey(final G7survey _g7survey){
        return this.repository.save(_g7survey);
    }

    public Mono<G7survey> updateG7survey(String userid, final Mono<G7survey> _g7surveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _g7surveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setG7Q1(u.getG7Q1());
                    p.setG7Q2(u.getG7Q2());
                    p.setG7Q3(u.getG7Q3());
                    p.setG7Q4(u.getG7Q4());
                    p.setG7Q5(u.getG7Q5());
                    p.setG7Q6(u.getG7Q6());
                    p.setG7Q7(u.getG7Q7());
                    p.setG7Q8(u.getG7Q8());
                    p.setG7Q9(u.getG7Q9());
                    p.setG7Q10(u.getG7Q10());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteG7survey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
