package com.aliyun.oss.demo;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

public class test {
    public static void main(String[] args) {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIYvWGQNIYDygL";
        String accessKeySecret = "AXytSx3Mqe0hHLutMNR5ArK45QlAHG";
        String bucketName = "xquu-image";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 创建存储空间。
        ossClient.createBucket(bucketName);

// 关闭OSSClient。
        ossClient.shutdown();

    }
}
