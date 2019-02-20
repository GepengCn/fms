## [接口文档][INTERFACE_DOC]

## 概要设计

### 归档扫描模块

1. 从归档中间表查询出所有未归档数据进行归档操作
2. 已归档数据，需要经过`归档变化`判断。有变化则更新结构化数据，无变化则不动。
3. 定时扫描

### 归档变化模块

1. 从业务流转数据判断该公文是否变化

### 归档执行模块

1. 查询业务公共数据存储
2. 查询业务个性化数据存储
    - 查询办理详情
3. 生成卷皮
4. 生成目录
5. 生成公文表单
6. 生成公文正文
7. 生成公文附件
8. 生成备考表
9. 上传至FTP服务器并保存路径信息

### 卷皮生成模块

1. 模版写入数据
2. word转PDF

### 目录生成模块

1. 模版写入数据
2. word转PDF

### 公文表单生成模块

1. 模版写入数据
2. word转PDF

### 公文正文生成模块

1. 公文解密
2. word转PDF

### 生成公文附件模块

1. 办公平台归档之后，将附件打包并上传至FTP服务器，然后将路径信息保存至中间表

### 生成备考表模块

1. 模版写入数据
2. word转PDF

### FTP上传模块

1. 将文件上传
2. 保存路径信息
3. FTP详情
    - IP地址：192.0.101.134 
    - 用户名密码：yongyou/yongyou  
    - 用户名密码：ftp/ftp123  
    - 路径：D://yongyou
   


### 结构化数据生成模块

1. 归档执行后的数据
2. 未发送到大数据中心的数据
3. http

### 归档结果查询模块

1. 定时查询
2. http
3. 更新办公平台归档状态

## 表设计

- 待归档中间表
    - 表名

        fms_file

    - 表字段

    | 序号 | 字段释义 | 字段名 | 字段类型|备注|
    | ------ | ------ | ------ | ------ | ------ |
    | 1 | 主键 | id |varchar(64)||
    | 2 | 任务id | taskId |varchar(64)||
    | 3 | 拟稿人登录名 | draftLogin |varchar(64)||
    | 4 | 拟稿人姓名 | draftName |varchar(64)||
    | 5 | 公文类型 | fileType |varchar(64)||
    | 6 | 归档状态 | status |int|100:待归档 101:正在归档 102:已归档 103:归档执行失败 200:已成功发送 201:发送失败 300:成功归档 301:归档失败|
    | 7 | 创建时间 | createTime |varchar(64)||
    | 8 | 修改时间 | modifyTime |varchar(64)||
    | 9 | 正文FTP路径 | textPath |varchar(256)||
    | 10 | 附件FTP路径 | attachPath |varchar(256)||
    | 11 | 公共数据 | commonData |blob|XML|
    | 12 | 个性化数据 | customizedData |blob|XML|

## 监控

### 分类

- 未归档数据

- 归档失败

- 已归档

### 作用

- 导出结构化数据
- 文件下载
- pdf导出
- 重新归档
- 更新归档
- 归档日志


## 其它资料

- mybatis逆向工程

```
java -jar mybatis-generator-core-1.3.7.jar  -configfile generatorConfig.xml -overwrite
java -jar mybatis-generator-core-1.3.7.jar  -configfile config_oracle.xml -overwrite
```

## 数据sql

- 已发事项

    - 公共数据

- 文件报批

    - 个性化数据
    - 附件及正文路径
    
- 办理详情

    - 流程

## 办公平台

1. 归档
  
    - 已发事项界面上新增归档按钮
    - taskId传递到后台
    - 附件及正文解密
    - 附件及正文上传FTP服务器
    - 公共数据存储中间表


[INTERFACE_DOC]:https://github.com/GepengCn/fms/blob/master/INTERFACE_DOC.md
