package org.cloudchallenge.codex.core


import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@ComponentScan
@EnableMongoRepositories
class CodexCoreConfiguration