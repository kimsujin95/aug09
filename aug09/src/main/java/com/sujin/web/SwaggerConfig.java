package com.sujin.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Swagger2 버전 활성화 annotation
@EnableSwagger2
// 설정 클래스 임을 나타내는 annotation
@Configuration
public class SwaggerConfig {
	
	// Swagger UI에 표시되는 설정 정보. title(), description(), version()
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
			.title("API")
			.version("0.0.1")
			.description("[Bamdule] API")
			.build();
	}

	@Bean
	public Docket api() {
		// Swagger API 문서에 대한 설명을 표기하는 메소드입니다. (선택)
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
			.select()
			// Swagger API 문서로 만들기 원하는 basePackage 경로입니다. (필수)
			.apis(RequestHandlerSelectors.basePackage("com.sujin.web"))
			// apis()로 선택되어진 API 중 특정 path 조건에 맞는 API들을 다시 필터링하여 문서화한다.
			.paths(PathSelectors.any())
			.build();
	}
	
}
