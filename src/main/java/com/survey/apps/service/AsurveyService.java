package com.survey.apps.service;

import com.survey.apps.entity.Asurvey;
import com.survey.apps.repository.AsurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AsurveyService {

    @Autowired
    private AsurveyRepository repository;

    public Flux<Asurvey> getAllAsurvey(){
        return this.repository.findAll();
    }

    public Mono<Asurvey> getAsurveyByUserid(String userid){
        return this.repository.findByUserid(userid);
    }

    public Mono<Asurvey> createAsurvey(final Asurvey _asurvey){
        return this.repository.save(_asurvey);
    }

    public Mono<Asurvey> updateAsurvey(String userid, final Mono<Asurvey> _asurveyMono){

        return this.repository.findByUserid(userid)
                .flatMap(p -> _asurveyMono.map(u -> {
                    p.setId(p.getId());
                    p.setUserid(p.getUserid());
                    p.setAq1(u.getAq1());
                    p.setAq2(u.getAq2());
                    p.setAq3(u.getAq3());
                    p.setAq4(u.getAq4());
                    p.setAq5(u.getAq5());
                    p.setAq6(u.getAq6());
                    p.setAq7(u.getAq7());
                    p.setAq8(u.getAq8());
                    p.setAq9(u.getAq9());
                    p.setAq10(u.getAq10());
                    p.setAq11(u.getAq11());
                    p.setAq12(u.getAq12());
                    p.setAq13(u.getAq13());
                    p.setAq14(u.getAq14());
                    p.setAq15(u.getAq15());
                    p.setAq16(u.getAq16());
                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteAsurvey(final String userid){
        return this.repository.deleteByUserid(userid);
    }

//    public boolean existsByUserid(final String userid){
//
//        final String[] _userid = new String[1];
//
//        //Mono<Asurvey> data = this.repository.findByUserid(userid);
//
//        this.repository.findByUserid(userid).subscribe(x -> _userid[0] = x.getUserid());
//
//        if(_userid[0] == userid){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public Mono<Boolean> existsByUserid(final String userid){
        return this.repository.existsByUserid(userid);
    }

}
