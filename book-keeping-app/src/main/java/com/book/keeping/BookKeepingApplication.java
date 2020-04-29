package com.book.keeping;

import cn.stylefeng.roses.kernel.logger.util.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 系统管理
 */
@SpringBootApplication
public class BookKeepingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookKeepingApplication.class, args);
        LogUtil.info("BookKeeping Server Start SUCCESS！");
    }


}
