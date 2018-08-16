package top.zhzhao.sbm;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
//这里是扫描dao接口的包用于识别mybatis
@MapperScan(basePackages="top.zhzhao.sbm.mapper.*Mapper")
public class SbmApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SbmApplication.class, args);
		SpringApplication app = new SpringApplication(SbmApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		//		SpringApplication.run(Application.class, args);
	}
}
