package com.example.breadcrumb.demo.domain

class BreadcrumbSpecification extends spock.lang.Specification {
    def "パンくずを返却する"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }
}
