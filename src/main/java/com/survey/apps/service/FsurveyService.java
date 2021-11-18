package com.survey.apps.service;

import com.survey.apps.entity.Fsurvey;
import com.survey.apps.repository.FsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class FsurveyService {

    @Autowired
    private FsurveyRepository repository;

    public Flux<Fsurvey> getAllFsurvey(){
        return this.repository.findAll();
    }

    public Mono<Fsurvey> getFsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Fsurvey> createFsurvey(final Fsurvey _fsurvey){
        return this.repository.save(_fsurvey);
    }

    public Mono<Fsurvey> updateFsurvey(String userid, final Mono<Fsurvey> _fsurveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _fsurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setFQ1(u.getFQ1());
                    p.setFQ2(u.getFQ2());
                    p.setFQ3(u.getFQ3());
                    p.setFQ4(u.getFQ4());
                    p.setFQ5(u.getFQ5());
                    p.setFQ6(u.getFQ6());
                    p.setFQ7(u.getFQ7());
                    p.setFQ8(u.getFQ8());
                    p.setFQ9(u.getFQ9());
                    p.setFQ10(u.getFQ10());

                    p.setFQ11(u.getFQ11());
                    p.setFQ12(u.getFQ12());
                    p.setFQ13(u.getFQ13());
                    p.setFQ14(u.getFQ14());
                    p.setFQ15(u.getFQ15());
                    p.setFQ16(u.getFQ16());
                    p.setFQ17(u.getFQ17());
                    p.setFQ18(u.getFQ18());
                    p.setFQ19(u.getFQ19());
                    p.setFQ20(u.getFQ20());

                    p.setFQ21(u.getFQ21());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteFsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
