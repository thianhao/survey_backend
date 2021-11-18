package com.survey.apps.controller;

import com.survey.apps.entity.Dsurvey;
import com.survey.apps.service.DsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("dsurvey")
public class DsurveyController {

    @Autowired
    private DsurveyService dsurveyService;

    @GetMapping("all")
    public Flux<Dsurvey> getAll(){
        return this.dsurveyService.getAllDsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Dsurvey>> getDsurveyByUserid(@PathVariable String userid){
        return this.dsurveyService.getDsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Dsurvey> createDsurvey(@RequestBody Mono<Dsurvey> dsurveyMono){
        return dsurveyMono.flatMap(this.dsurveyService::createDsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Dsurvey> updateDsurvey(@PathVariable String userid,
                                       @RequestBody Mono<Dsurvey> dsurveyMono){
        return this.dsurveyService.updateDsurvey(userid, dsurveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteDsurvey(@PathVariable String userid){
        return this.dsurveyService.deleteDsurvey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.dsurveyService.existsByUserid(userid);
    }

}
