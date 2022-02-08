package com.tomoaki3284.accountapi.controller

import com.tomoaki3284.accountapi.service.StatsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Mono

@Controller
@RequestMapping("/api/stats/v1")
class StatsController {

    private val statsService: StatsService

    @Autowired
    constructor(statsService: StatsService) {
        this.statsService = statsService
    }

    @GetMapping("/problems")
    fun problems(): Mono<ResponseEntity<List<Object>>> {
        return Mono.just(
                ResponseEntity.ok()
                        .body(null)
        )
    }
}