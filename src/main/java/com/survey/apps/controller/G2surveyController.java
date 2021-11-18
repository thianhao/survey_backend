package com.survey.apps.controller;

import com.survey.apps.entity.G2survey;
import com.survey.apps.service.G2surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g2survey")
public class G2surveyController {

    @Autowired
    private G2surveyService g2surveyService;

    @GetMapping("all")
    public Flux<G2survey> getAll(){
        return this.g2surveyService.getAllG2survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G2survey>> getG2surveyByUserid(@PathVariable String userid){
        return this.g2surveyService.getG2surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G2survey> createG2survey(@RequestBody Mono<G2survey> g2surveyMono){
        return g2surveyMono.flatMap(this.g2surveyService::createG2survey);
    }

    @PutMapping("{userid}")
    public Mono<G2survey> updateG2survey(@PathVariable String userid,
                                         @RequestBody Mono<G2survey> g2surveyMono){
        return this.g2surveyService.updateG2survey(userid, g2surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG2survey(@PathVariable String userid){
        return this.g2surveyService.deleteG2survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g2surveyService.existsByUserid(userid);
    }

}
