package eu.xtrf.custom.clickup.dto

enum IssueTypeEnum {
    STORY("Story"),
    BUG("Bug"),
    TASK("Task"),
    EPIC("Epic")

    String value

    IssueTypeEnum(String value) {
        this.value = value
    }
}
