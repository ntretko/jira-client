package eu.xtrf.custom.clickup.client


import io.micronaut.http.BasicAuth
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client

import javax.validation.constraints.NotBlank

@Client('${jira.url}')
interface JiraRestClient {
    @Post("/rest/api/2/search")
    eu.xtrf.custom.clickup.dto.JiraSearchDTO searchForIssues(@NotBlank @QueryValue String jql, BasicAuth basicAuth)
}