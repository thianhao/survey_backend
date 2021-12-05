package com.survey.apps.controller;

import com.survey.apps.entity.Bsurvey;
import com.survey.apps.service.BsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

// import static com.survey.apps.AppsApplication.CORSclient;

// @CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("bsurvey")
public class BsurveyController {

    @Autowired
    private BsurveyService bsurveyService;

    @GetMapping("all")
    public Flux<Bsurvey> getAll(){
        return this.bsurveyService.getAllBsurvey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<Bsurvey>> getBsurveyByUserid(@PathVariable String userid){
        return this.bsurveyService.getBsurveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Bsurvey> createBsurvey(@RequestBody Mono<Bsurvey> bsurveyMono){
        return bsurveyMono.flatMap(this.bsurveyService::createBsurvey);
    }

    @PutMapping("{userid}")
    public Mono<Bsurvey> updateBsurvey(@PathVariable String userid,
                                       @RequestBody Mono<Bsurvey> bsurveyMono){
        return this.bsurveyService.updateBsurvey(userid, bsurveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteBsurvey(@PathVariable String userid){
        return this.bsurveyService.deleteBsurvey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.bsurveyService.existsByUserid(userid);
    }

}
