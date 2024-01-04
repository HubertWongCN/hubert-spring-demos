package org.hubert.springboot.mysql57.mybatisplus.gencode;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

import java.io.IOException;

/**
 * @author hubertwong
 */
public class TestGenCode {

    public static void main(String[] args) throws IOException {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test_db?useSSL=false&autoReconnect=true&characterEncoding=utf8&AllowPublicKeyRetrieval=true", "root", "123456")
                .globalConfig(builder ->
                        builder.author("hubertwong") // 设置作者
                                .enableSwagger() // 开启 swagger 模式
                                .outputDir(System.getProperty("user.dir")
                                        + "/springboot-demo-mysql57-mybatisplus-gencode/src/main/java")
                )
                .packageConfig(builder ->
                        builder.parent("org.hubert.springboot.mysql57.mybatisplus") // 设置父包名
                                .moduleName("gencode") // 设置父包模块名
                )
                .strategyConfig(builder ->
                        builder.addInclude("tb_user", "tb_role", "tb_user_role")
                )
                .execute();
    }
}
