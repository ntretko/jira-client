package eu.xtrf.custom.clickup.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class JiraIssue {
    String key
    Fields fields
    String description
    String summary

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Fields {
        IssueType issueType
        List<IssueLink> issueLinks
        User assignee
        Priority priority
        Status status
        User reporter
        List<JiraIssue> subtasks
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IssueType {
        String name
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IssueLink {
        IssueLinkType type
        @JsonProperty(required = false)
        InwardOutwardIssue inwardIssue
        @JsonProperty(required = false)
        InwardOutwardIssue outwardIssue
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class IssueLinkType {
        String outward
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class InwardOutwardIssue {
        String key

        @JsonIgnore
        String getIssueUrl() {
            return "https://jira.dev.xtrf.eu/browse/$key"
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class User {
        String displayName
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Priority {
        String name
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class Status {
        String name
    }
}
