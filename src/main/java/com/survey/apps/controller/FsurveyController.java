package com.survey.apps.controller;

import com.survey.apps.entity.Fsurvey;
import com.survey.apps.service.FsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("fsurvey")
public class FsurveyController {

    @Autowired
    private FsurveyService fsurveyService;

    @GetMapping("all")
    public Flux<Fsurvey> getAll(){
        return this.fsurveyService.getAllFsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Fsurvey>> getFsurveyByUserid(@PathVariable String userid){
        return this.fsurveyService.getFsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Fsurvey> createFsurvey(@RequestBody Mono<Fsurvey> fsurveyMono){
        return fsurveyMono.flatMap(this.fsurveyService::createFsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Fsurvey> updateFsurvey(@PathVariable String userid,
                                       @RequestBody Mono<Fsurvey> fsurveyMono){
        return this.fsurveyService.updateFsurvey(userid, fsurveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteFsurvey(@PathVariable String userid){
        return this.fsurveyService.deleteFsurvey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.fsurveyService.existsByUserid(userid);
    }

}
