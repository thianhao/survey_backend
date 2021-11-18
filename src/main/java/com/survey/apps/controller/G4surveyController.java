package com.survey.apps.controller;

import com.survey.apps.entity.G4survey;
import com.survey.apps.service.G4surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g4survey")
public class G4surveyController {

    @Autowired
    private G4surveyService g4surveyService;

    @GetMapping("all")
    public Flux<G4survey> getAll(){
        return this.g4surveyService.getAllG4survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G4survey>> getG4surveyByUserid(@PathVariable String userid){
        return this.g4surveyService.getG4surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G4survey> createG4survey(@RequestBody Mono<G4survey> g4surveyMono){
        return g4surveyMono.flatMap(this.g4surveyService::createG4survey);
    }

    @PutMapping("{userid}")
    public Mono<G4survey> updateG4survey(@PathVariable String userid,
                                         @RequestBody Mono<G4survey> g4surveyMono){
        return this.g4surveyService.updateG4survey(userid, g4surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG4survey(@PathVariable String userid){
        return this.g4surveyService.deleteG4survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g4surveyService.existsByUserid(userid);
    }

}
