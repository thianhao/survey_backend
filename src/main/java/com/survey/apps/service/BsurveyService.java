package com.survey.apps.service;

import com.survey.apps.entity.Bsurvey;
import com.survey.apps.repository.BsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BsurveyService {

    @Autowired
    private BsurveyRepository repository;

    public Flux<Bsurvey> getAllBsurvey(){
        return this.repository.findAll();
    }

    public Mono<Bsurvey> getBsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Bsurvey> createBsurvey(final Bsurvey _bsurvey){
        return this.repository.save(_bsurvey);
    }

    public Mono<Bsurvey> updateBsurvey(String userid, final Mono<Bsurvey> _bsurveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _bsurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setBQ1(u.getBQ1());
                    p.setBQ2(u.getBQ2());
                    p.setBQ3(u.getBQ3());
                    p.setBQ4(u.getBQ4());
                    p.setBQ5(u.getBQ5());
                    p.setBQ6(u.getBQ6());
                    p.setBQ7(u.getBQ7());
                    p.setBQ8(u.getBQ8());
                    p.setBQ9(u.getBQ9());
                    p.setBQ10(u.getBQ10());

                    p.setBQ11(u.getBQ11());
                    p.setBQ12(u.getBQ12());
                    p.setBQ13(u.getBQ13());
                    p.setBQ14(u.getBQ14());
                    p.setBQ15(u.getBQ15());
                    p.setBQ16(u.getBQ16());
                    p.setBQ17(u.getBQ17());
                    p.setBQ18(u.getBQ18());
                    p.setBQ19(u.getBQ19());
                    p.setBQ20(u.getBQ20());

                    p.setBQ21(u.getBQ21());
                  

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteBsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
