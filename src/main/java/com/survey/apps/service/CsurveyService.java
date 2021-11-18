package com.survey.apps.service;

import com.survey.apps.entity.Csurvey;
import com.survey.apps.repository.CsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CsurveyService {

    @Autowired
    private CsurveyRepository repository;

    public Flux<Csurvey> getAllCsurvey(){
        return this.repository.findAll();
    }

    public Mono<Csurvey> getCsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Csurvey> createCsurvey(final Csurvey _csurvey){
        return this.repository.save(_csurvey);
    }

    public Mono<Csurvey> updateCsurvey(String userid, final Mono<Csurvey> _csurveyMono){
        return this.repository.findByUserid(userid)
                .flatMap(p -> _csurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());

                    p.setCQ1(u.getCQ1());
                    p.setCQ2(u.getCQ2());
                    p.setCQ3(u.getCQ3());
                    p.setCQ4(u.getCQ4());
                    p.setCQ5(u.getCQ5());
                    p.setCQ6(u.getCQ6());
                    p.setCQ7(u.getCQ7());
                    p.setCQ8(u.getCQ8());
                    p.setCQ9(u.getCQ9());
                    p.setCQ10(u.getCQ10());

                    p.setCQ11(u.getCQ11());
                    p.setCQ12(u.getCQ12());
                    p.setCQ13(u.getCQ13());
                    p.setCQ14(u.getCQ14());
                    p.setCQ15(u.getCQ15());
                    p.setCQ16(u.getCQ16());
                    p.setCQ17(u.getCQ17());
                    p.setCQ18(u.getCQ18());
                    p.setCQ19(u.getCQ19());
                    p.setCQ20(u.getCQ20());

                    p.setCQ21(u.getCQ21());
                    p.setCQ22(u.getCQ22());
                    p.setCQ23(u.getCQ23());
                    p.setCQ24(u.getCQ24());
                    p.setCQ25(u.getCQ25());
                    p.setCQ26(u.getCQ26());
                    p.setCQ27(u.getCQ27());
                    p.setCQ28(u.getCQ28());
                    p.setCQ29(u.getCQ29());
                    p.setCQ30(u.getCQ30());

                    p.setCQ31(u.getCQ31());
                    p.setCQ32(u.getCQ32());
                    p.setCQ33(u.getCQ33());
                    p.setCQ34(u.getCQ34());
                    p.setCQ35(u.getCQ35());
                    p.setCQ36(u.getCQ36());
                    p.setCQ37(u.getCQ37());
                    p.setCQ38(u.getCQ38());
                    p.setCQ39(u.getCQ39());
                    p.setCQ40(u.getCQ40());

                    p.setCQ41(u.getCQ41());
                    p.setCQ42(u.getCQ42());
                    p.setCQ43(u.getCQ43());
                    p.setCQ44(u.getCQ44());
                    p.setCQ45(u.getCQ45());
                    p.setCQ46(u.getCQ46());
                    p.setCQ47(u.getCQ47());
                    p.setCQ48(u.getCQ48());
                    p.setCQ49(u.getCQ49());
                    p.setCQ50(u.getCQ50());

                    p.setCQ51(u.getCQ51());
                    p.setCQ52(u.getCQ52());
                    p.setCQ53(u.getCQ53());
                    p.setCQ54(u.getCQ54());
                    p.setCQ55(u.getCQ55());
                    p.setCQ56(u.getCQ56());
                    p.setCQ57(u.getCQ57());
                    p.setCQ58(u.getCQ58());
                    p.setCQ59(u.getCQ59());
                    p.setCQ60(u.getCQ60());

                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteCsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
