package org.hubert.springboot.knife4j.config;

import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import io.swagger.annotations.ApiOperation;
import org.hubert.springboot.knife4j.constant.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * swagger2 config for open api.
 *
 * @author hubertwong
 */
@Configuration
@EnableSwagger2WebMvc
public class OpenApiConfig {

    private final OpenApiExtensionResolver openApiExtensionResolver;

    @Autowired
    public OpenApiConfig(OpenApiExtensionResolver openApiExtensionResolver) {
        this.openApiExtensionResolver = openApiExtensionResolver;
    }

    /**
     * @return swagger config
     */
    @Bean
    public Docket openApi() {
        String groupName = "Test Group";
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Test group")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(getGlobalRequestParameters())
                .globalResponseMessage(RequestMethod.GET, getGlobalResponse())
                .extensions(openApiExtensionResolver.buildExtensions(groupName))
                .extensions(openApiExtensionResolver.buildSettingExtensions());
    }

    /**
     * gen global response
     *
     * @return global response code -> description
     */
    private List<ResponseMessage> getGlobalResponse() {
        return ResponseStatus.HTTP_STATUS_ALL.stream()
                .map(a ->
                        new ResponseMessageBuilder()
                                .code(Integer.parseInt(a.getResponseCode()))
                                .message(a.getDescription())
                                .build())
                .collect(Collectors.toList());
    }

    /**
     * gen global request parameters
     *
     * @return global request parameters
     */
    private List<Parameter> getGlobalRequestParameters() {
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(new ParameterBuilder()
                .name("AppKey")
                .description("App Key")
                .defaultValue("app-key-xxx-1")
                .modelRef(new ModelRef("String"))
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
