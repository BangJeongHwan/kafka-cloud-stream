package com.brett.kafkacloudstream.config

import mu.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer

private val log = KotlinLogging.logger {}

@Configuration
class KafkaConfig {
    @Bean
    fun basicConsumer(): Consumer<String> {
        return Consumer { str -> log.info("Consumer Received >> $str") }
    }
}