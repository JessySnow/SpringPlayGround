package org.play.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

// 实验 Spring 的 Resource
public class Main {
    public static void main(String[] args) {
        // DefaultResourceLoader 没有协议指定的情况下加载的是 ClassPath 的资源
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        try{
            // 没有使用 file协议 默认从 classpath 加载数据
            Resource defaultResource = resourceLoader.getResource("/Users/shushi/nohup.out");
            // 使用 file协议 将会使用 UrlResource 的形式加载数据
            Resource fileUrlResource = resourceLoader.getResource("file:/Users/shushi/nohup.out");
            // 抛出错误
//            System.out.println(defaultResource.getFile().getName());
            System.out.println(fileUrlResource.getFile().getName());
        }catch (Exception e){
            System.out.println("Classpath resource not found!");
        }

        // 使用 FileResourceLoader 没有协议制定的情况下从文件系统加载资源
        FileSystemResourceLoader fileResourceLoader = new FileSystemResourceLoader();
        Resource resource = fileResourceLoader.getResource("/Users/shushi/nohup.out");
        try {
            System.out.println(resource.getFile().getName());
        } catch (IOException e) {
            System.out.println("File not found!");
        }

        // 使用 URL 获取数据的演示
        Resource urlResource = resourceLoader.getResource("https://www.baidu.com/");
        if(urlResource.isFile()){
            System.out.println("File Resource");
        }else{
            System.out.println("Url Resource");
        }
    }
}
