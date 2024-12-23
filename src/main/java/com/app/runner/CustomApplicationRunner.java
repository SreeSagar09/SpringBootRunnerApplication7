package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("From run method in CustomApplicationRunner class.");
		System.out.println("NonOptionArgs: "+args.getNonOptionArgs());
		System.out.println("NonOptionArgs size: "+args.getNonOptionArgs().size());
		System.out.println("OptionNames: "+args.getOptionNames());
		System.out.println("OptionNames size: "+args.getOptionNames().size());
	}
}
