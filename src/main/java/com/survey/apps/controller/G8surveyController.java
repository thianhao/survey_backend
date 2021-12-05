package com.survey.apps.controller;

import com.survey.apps.entity.G8survey;
import com.survey.apps.service.G8surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//import static com.survey.apps.AppsApplication.CORSclient;

//@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g8survey")
public class G8surveyController {

    @Autowired
    private G8surveyService g8surveyService;

    @GetMapping("all")
    public Flux<G8survey> getAll(){
        return this.g8surveyService.getAllG8survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G8survey>> getG8surveyByUserid(@PathVariable String userid){
        return this.g8surveyService.getG8surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G8survey> createG8survey(@RequestBody Mono<G8survey> g8surveyMono){
        return g8surveyMono.flatMap(this.g8surveyService::createG8survey);
    }

    @PutMapping("{userid}")
    public Mono<G8survey> updateG8survey(@PathVariable String userid,
                                         @RequestBody Mono<G8survey> g8surveyMono){
        return this.g8surveyService.updateG8survey(userid, g8surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG8survey(@PathVariable String userid){
        return this.g8surveyService.deleteG8survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g8surveyService.existsByUserid(userid);
    }

}
