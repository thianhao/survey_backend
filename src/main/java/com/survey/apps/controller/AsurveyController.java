package com.survey.apps.controller;

import com.survey.apps.entity.Asurvey;
import com.survey.apps.service.AsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

import static com.survey.apps.AppsApplication.CORSclient;

// @RequestMapping("asurvey")
@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("asurvey")
public class AsurveyController {

    @Autowired
    private AsurveyService asurveyService;

    @GetMapping("all")
    public Flux<Asurvey> getAll(){
        return this.asurveyService.getAllAsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Asurvey>> getAsurveyByUserid(@PathVariable String userid){
        return this.asurveyService.getAsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Asurvey> createAsurvey(@RequestBody Mono<Asurvey> asurveyMono){
        return asurveyMono.flatMap(this.asurveyService::createAsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Asurvey> updateAsurvey(@PathVariable String userid,
                                            @Valid @RequestBody Mono<Asurvey> asurveyMono){
        return this.asurveyService.updateAsurvey(userid, asurveyMono);
    }

    @DeleteMapping("/delete/{userid}")
    public Mono<Void> deleteAsurvey(@PathVariable String userid){
        return this.asurveyService.deleteAsurvey(userid);
    }


    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.asurveyService.existsByUserid(userid);
    }

}
