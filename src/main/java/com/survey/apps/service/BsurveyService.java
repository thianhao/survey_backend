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
                    p.setBQ22(u.getBQ22());
                    p.setBQ23(u.getBQ23());
                    p.setBQ24(u.getBQ24());
                    p.setBQ25(u.getBQ25());
                    p.setBQ26(u.getBQ26());
                    p.setBQ27(u.getBQ27());
                    p.setBQ28(u.getBQ28());
                    p.setBQ29(u.getBQ29());
                    p.setBQ30(u.getBQ30());

                    p.setBQ31(u.getBQ31());
                    p.setBQ32(u.getBQ32());
                    p.setBQ33(u.getBQ33());
                    p.setBQ34(u.getBQ34());
                    p.setBQ35(u.getBQ35());
                    p.setBQ36(u.getBQ36());
                    p.setBQ37(u.getBQ37());
                    p.setBQ38(u.getBQ38());
                    p.setBQ39(u.getBQ39());
                    p.setBQ40(u.getBQ40());

                    p.setBQ41(u.getBQ41());
                    p.setBQ42(u.getBQ42());
                    p.setBQ43(u.getBQ43());
                    p.setBQ44(u.getBQ44());
                    p.setBQ45(u.getBQ45());
                    p.setBQ46(u.getBQ46());
                    p.setBQ47(u.getBQ47());
                    p.setBQ48(u.getBQ48());
                    p.setBQ49(u.getBQ49());
                    p.setBQ50(u.getBQ50());

                    p.setBQ51(u.getBQ51());
                    p.setBQ52(u.getBQ52());
                    p.setBQ53(u.getBQ53());


                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteBsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

    public Mono<Boolean> existsByUserid(final String userid){ return this.repository.existsByUserid(userid);}

}
