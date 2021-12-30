package com.survey.apps.controller;

import com.survey.apps.entity.G6survey;
import com.survey.apps.service.G6surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;
//
@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g6survey")
public class G6surveyController {

    @Autowired
    private G6surveyService g6surveyService;

    @GetMapping("all")
    public Flux<G6survey> getAll(){
        return this.g6surveyService.getAllG6survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G6survey>> getG6surveyByUserid(@PathVariable String userid){
        return this.g6surveyService.getG6surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G6survey> createG6survey(@RequestBody Mono<G6survey> g6surveyMono){
        return g6surveyMono.flatMap(this.g6surveyService::createG6survey);
    }

    @PutMapping("{userid}")
    public Mono<G6survey> updateG6survey(@PathVariable String userid,
                                         @RequestBody Mono<G6survey> g6surveyMono){
        return this.g6surveyService.updateG6survey(userid, g6surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG6survey(@PathVariable String userid){
        return this.g6surveyService.deleteG6survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g6surveyService.existsByUserid(userid);
    }

}
