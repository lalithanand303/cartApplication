package com.example.CustomerRecord.Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
public class LoggerInstance {
	Logger logging = LoggerFactory.getLogger(LoggerInstance.class);

}
