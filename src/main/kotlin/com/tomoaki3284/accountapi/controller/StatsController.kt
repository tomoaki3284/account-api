package com.tomoaki3284.accountapi.controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Mono

@Controller
@RequestMapping("/api/stats/v1")
class StatsController {

    private val statsController: StatsController

    @Autowired
    constructor(statsController: StatsController) {
        this.statsController = statsController
    }

    @GetMapping("/problems")
    fun problems(): Mono<ResponseEntity<List<Object>>> {
        return Mono.just(
                ResponseEntity.ok()
                        .body(null)
        )
    }
}