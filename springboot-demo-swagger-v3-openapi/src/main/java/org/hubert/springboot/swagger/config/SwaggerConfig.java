package org.hubert.springboot.swagger.config;

import io.swagger.annotations.ApiOperation;
import org.hubert.springboot.swagger.constant.ResponseStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.*;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * swagger config for open api.
 *
 * @author hubertwong
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    /**
     * @return swagger config
     */
    @Bean
    public Docket openApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("Test group")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalRequestParameters(getGlobalRequestParameters())
                .globalResponses(HttpMethod.GET, getGlobalResponse());
    }

    /**
     * gen global response
     *
     * @return global response code -> description
     */
    private List<Response> getGlobalResponse() {
        return ResponseStatus.HTTP_STATUS_ALL.stream()
                .map(a ->
                        new ResponseBuilder()
                                .code(a.getResponseCode())
                                .description(a.getDescription())
                                .build())
                .collect(Collectors.toList());
    }

    /**
     * gen global request parameters
     *
     * @return global request parameters
     */
    private List<RequestParameter> getGlobalRequestParameters() {
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder()
                .name("Appkey")
                .description("APP key")
                .required(false)
                .in(ParameterType.QUERY)
                .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
                .required(false)
                .build());
        return parameters;
    }

    /**
     * gen api info
     *
     * @return api info
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger API")
                .description("test api")
                .contact(new Contact("hubert", "https://hubertwongcn.github.io/", "hubertwongcn@gmail.com"))
                .termsOfServiceUrl("https://hubertwongcn.github.io/")
                .version("1.0")
                .build();
    }
}
