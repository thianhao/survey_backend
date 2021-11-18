package com.survey.apps.controller;

import com.survey.apps.entity.Esurvey;
import com.survey.apps.service.EsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("esurvey")
public class EsurveyController {

    @Autowired
    private EsurveyService esurveyService;

    @GetMapping("all")
    public Flux<Esurvey> getAll(){
        return this.esurveyService.getAllEsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Esurvey>> getEsurveyByUserid(@PathVariable String userid){
        return this.esurveyService.getEsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Esurvey> createEsurvey(@RequestBody Mono<Esurvey> esurveyMono){
        return esurveyMono.flatMap(this.esurveyService::createEsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Esurvey> updateEsurvey(@PathVariable String userid,
                                       @RequestBody Mono<Esurvey> esurveyMono){
        return this.esurveyService.updateEsurvey(userid, esurveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteEsurvey(@PathVariable String userid){
        return this.esurveyService.deleteEsurvey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.esurveyService.existsByUserid(userid);
    }

}
