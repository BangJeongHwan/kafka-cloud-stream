package com.brett.kafkacloudstream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class KafkaCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<KafkaCloudStreamApplication>(*args)
}
