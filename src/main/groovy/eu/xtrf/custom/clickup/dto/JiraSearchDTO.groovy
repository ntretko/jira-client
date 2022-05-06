package eu.xtrf.custom.clickup.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class JiraSearchDTO {

    List<JiraIssue> issues

}
