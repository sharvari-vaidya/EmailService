package com.main.emailService.configuration;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class ThreadPoolConfig {
	@Bean("ThreadPool")
	public TaskExecutor getThreadPoo1() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(16);
		executor.setMaxPoolSize(50);
		executor.setThreadNamePrefix("Thread--");
		executor.setQueueCapacity(1000);
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
		executor.setAwaitTerminationSeconds(10);
		executor.initialize();
		return executor;
	}
}
