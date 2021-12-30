package com.survey.apps.controller;

import com.survey.apps.entity.G3survey;
import com.survey.apps.service.G3surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g3survey")
public class G3surveyController {

    @Autowired
    private G3surveyService g3surveyService;

    @GetMapping("all")
    public Flux<G3survey> getAll(){
        return this.g3surveyService.getAllG3survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G3survey>> getG3surveyByUserid(@PathVariable String userid){
        return this.g3surveyService.getG3surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G3survey> createG3survey(@RequestBody Mono<G3survey> g3surveyMono){
        return g3surveyMono.flatMap(this.g3surveyService::createG3survey);
    }

    @PutMapping("{userid}")
    public Mono<G3survey> updateG3survey(@PathVariable String userid,
                                         @RequestBody Mono<G3survey> g3surveyMono){
        return this.g3surveyService.updateG3survey(userid, g3surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG3survey(@PathVariable String userid){
        return this.g3surveyService.deleteG3survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g3surveyService.existsByUserid(userid);
    }

}
