package com.survey.apps.service;

import com.survey.apps.entity.Dsurvey;
import com.survey.apps.repository.DsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DsurveyService {

    @Autowired
    private DsurveyRepository repository;

    public Flux<Dsurvey> getAllDsurvey(){
        return this.repository.findAll();
    }

    public Mono<Dsurvey> getDsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Dsurvey> createDsurvey(final Dsurvey _dsurvey){
        return this.repository.save(_dsurvey);
    }

    public Mono<Dsurvey> updateDsurvey(String userid, final Mono<Dsurvey> _dsurveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _dsurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setDQ1(u.getDQ1());
                    p.setDQ2(u.getDQ2());
                    p.setDQ3(u.getDQ3());
                    p.setDQ4(u.getDQ4());
                    p.setDQ5(u.getDQ5());
                    p.setDQ6(u.getDQ6());
                    p.setDQ7(u.getDQ7());
                    p.setDQ8(u.getDQ8());
                    p.setDQ9(u.getDQ9());
                    p.setDQ10(u.getDQ10());

                    p.setDQ11(u.getDQ11());
                    p.setDQ12(u.getDQ12());
                    p.setDQ13(u.getDQ13());
                    p.setDQ14(u.getDQ14());
                    p.setDQ15(u.getDQ15());
                    p.setDQ16(u.getDQ16());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteDsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
