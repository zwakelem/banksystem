package za.co.discovery.banksystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Config {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiEndPointsInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("za.co.discovery.banksystem.controller"))
        .paths(PathSelectors.any())
        .build();
  }


  private ApiInfo apiEndPointsInfo() {
    return new ApiInfoBuilder().title("Bank System REST API")
        .description("Bank Balance and Dispensing System REST API")
        .license("Apache 2.0")
        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
        .version("1.0.0")
        .contact(new Contact("iOCO", "www.eohdigital.com", "zwakele.mgabhi@eoh.com"))
        .build();
  }
}
