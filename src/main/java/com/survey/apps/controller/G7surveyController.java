package com.survey.apps.controller;

import com.survey.apps.entity.G7survey;
import com.survey.apps.service.G7surveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static com.survey.apps.AppsApplication.CORSclient;

@CrossOrigin(origins = CORSclient, maxAge = 3600) // CORS Config for web browser
@RestController
@RequestMapping("g7survey")
public class G7surveyController {

    @Autowired
    private G7surveyService g7surveyService;

    @GetMapping("all")
    public Flux<G7survey> getAll(){
        return this.g7surveyService.getAllG7survey();
    }

    @GetMapping("{userid}")
    public Mono<ResponseEntity<G7survey>> getG7surveyByUserid(@PathVariable String userid){
        return this.g7surveyService.getG7surveyByUserid(userid)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<G7survey> createG7survey(@RequestBody Mono<G7survey> g7surveyMono){
        return g7surveyMono.flatMap(this.g7surveyService::createG7survey);
    }

    @PutMapping("{userid}")
    public Mono<G7survey> updateG7survey(@PathVariable String userid,
                                         @RequestBody Mono<G7survey> g7surveyMono){
        return this.g7surveyService.updateG7survey(userid, g7surveyMono);
    }

    @DeleteMapping("/{userid}")
    public Mono<Void> deleteG7survey(@PathVariable String userid){
        return this.g7surveyService.deleteG7survey(userid);
    }

    @GetMapping("/exist/{userid}")
    public Mono<Boolean> existsByUserid(@PathVariable String userid){
        return this.g7surveyService.existsByUserid(userid);
    }
}
