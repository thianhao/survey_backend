package com.survey.apps.controller;

import com.survey.apps.entity.Csurvey;
import com.survey.apps.service.CsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("csurvey")
public class CsurveyController {

    @Autowired
    private CsurveyService csurveyService;

    @GetMapping("all")
    public Flux<Csurvey> getAll(){
        return this.csurveyService.getAllCsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Csurvey>> getCsurveyByUserid(@PathVariable String userid){
        return this.csurveyService.getCsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Csurvey> createCsurvey(@RequestBody Mono<Csurvey> csurveyMono){
        return csurveyMono.flatMap(this.csurveyService::createCsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Csurvey> updateCsurvey(@PathVariable String userid,
                                       @RequestBody Mono<Csurvey> csurveyMono){
        return this.csurveyService.updateCsurvey(userid, csurveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteCsurvey(@PathVariable String userid){
        return this.csurveyService.deleteCsurvey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.csurveyService.existsByUserid(userid);
    }

}
