package com.boot.jenkins.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.boot.jenkins.SpringbootRestJenkinsGithubMavenTomcatDeployApplication;

public class ServletInitializer extends SpringBootServletInitializer{
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder.sources(SpringbootRestJenkinsGithubMavenTomcatDeployApplication.class);
}
}
