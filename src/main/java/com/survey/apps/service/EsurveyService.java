package com.survey.apps.service;

import com.survey.apps.entity.Esurvey;
import com.survey.apps.repository.EsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EsurveyService {

    @Autowired
    private EsurveyRepository repository;

    public Flux<Esurvey> getAllEsurvey(){
        return this.repository.findAll();
    }

    public Mono<Esurvey> getEsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Esurvey> createEsurvey(final Esurvey _esurvey){
        return this.repository.save(_esurvey);
    }

    public Mono<Esurvey> updateEsurvey(String userid, final Mono<Esurvey> _esurveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _esurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setEQ1(u.getEQ1());
                    p.setEQ2(u.getEQ2());
                    p.setEQ3(u.getEQ3());
                    p.setEQ4(u.getEQ4());
                    p.setEQ5(u.getEQ5());
                    p.setEQ6(u.getEQ6());
                    p.setEQ7(u.getEQ7());
                    p.setEQ8(u.getEQ8());
                    p.setEQ9(u.getEQ9());
                    p.setEQ10(u.getEQ10());

                    p.setEQ11(u.getEQ11());
                    p.setEQ12(u.getEQ12());
                    p.setEQ13(u.getEQ13());
                    p.setEQ14(u.getEQ14());
                    p.setEQ15(u.getEQ15());
                    p.setEQ16(u.getEQ16());
                    p.setEQ17(u.getEQ17());
                    p.setEQ18(u.getEQ18());
                    p.setEQ19(u.getEQ19());
                    p.setEQ20(u.getEQ20());

                    p.setEQ21(u.getEQ21());
                    p.setEQ22(u.getEQ22());
                    p.setEQ23(u.getEQ23());
                    p.setEQ24(u.getEQ24());
                    p.setEQ25(u.getEQ25());
                    p.setEQ26(u.getEQ26());
                    p.setEQ27(u.getEQ27());
                    p.setEQ28(u.getEQ28());
                    p.setEQ29(u.getEQ29());
                    p.setEQ30(u.getEQ30());

                    p.setEQ31(u.getEQ1());
                    p.setEQ32(u.getEQ2());
                    p.setEQ33(u.getEQ3());
                    p.setEQ34(u.getEQ4());
                    p.setEQ35(u.getEQ5());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteEsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
