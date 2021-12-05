package com.survey.apps.controller;

import com.survey.apps.entity.G1survey;
import com.survey.apps.service.G1surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//import static com.survey.apps.AppsApplication.CORSclient;

//@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g1survey")
public class G1surveyController {

    @Autowired
    private G1surveyService g1surveyService;

    @GetMapping("all")
    public Flux<G1survey> getAll(){
        return this.g1surveyService.getAllG1survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G1survey>> getG1surveyByUserid(@PathVariable String userid){
        return this.g1surveyService.getG1surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G1survey> createG1survey(@RequestBody Mono<G1survey> g1surveyMono){
        return g1surveyMono.flatMap(this.g1surveyService::createG1survey);
    }

    @PutMapping("{userid}")
    public Mono<G1survey> updateG1survey(@PathVariable String userid,
                                       @RequestBody Mono<G1survey> g1surveyMono){
        return this.g1surveyService.updateG1survey(userid, g1surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG1survey(@PathVariable String userid){
        return this.g1surveyService.deleteG1survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g1surveyService.existsByUserid(userid);
    }

}
