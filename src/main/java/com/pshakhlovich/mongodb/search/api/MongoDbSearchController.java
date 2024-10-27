package com.pshakhlovich.mongodb.search.api;

import com.pshakhlovich.mongodb.search.service.MongoDbSearchService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import lombok.RequiredArgsConstructor;

@Controller("api/v1/search")
@ExecuteOn(TaskExecutors.BLOCKING)
@RequiredArgsConstructor
public class MongoDbSearchController {

    private final MongoDbSearchService searchService;

    @Get
    public HttpResponse<String> search() {
        return HttpResponse.ok(searchService.search());
    }

}
