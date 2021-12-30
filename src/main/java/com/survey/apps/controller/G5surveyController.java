package com.survey.apps.controller;

import com.survey.apps.entity.G5survey;
import com.survey.apps.service.G5surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g5survey")
public class G5surveyController {

    @Autowired
    private G5surveyService g5surveyService;

    @GetMapping("all")
    public Flux<G5survey> getAll(){
        return this.g5surveyService.getAllG5survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G5survey>> getG5surveyByUserid(@PathVariable String userid){
        return this.g5surveyService.getG5surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G5survey> createG5survey(@RequestBody Mono<G5survey> g5surveyMono){
        return g5surveyMono.flatMap(this.g5surveyService::createG5survey);
    }

    @PutMapping("{userid}")
    public Mono<G5survey> updateG5survey(@PathVariable String userid,
                                         @RequestBody Mono<G5survey> g5surveyMono){
        return this.g5surveyService.updateG5survey(userid, g5surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG5survey(@PathVariable String userid){
        return this.g5surveyService.deleteG5survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g5surveyService.existsByUserid(userid);
    }

}
